package org.example.authservice.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.example.authservice.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JwtTokenUtils {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.lifetime}")
    private Duration lifeTime;

    public String generateToken(User user) {

        Map<String, Object> claims = new HashMap<>();
        List<String> roles = user.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList();
        claims.put("roles", roles);
        claims.put("email", user.getEmail());

        return Jwts.builder()
                .claims(claims)
                .subject(user.getUsername())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + lifeTime.toMillis()))
                .signWith(getSigningKey())
                .compact();
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        String userName = getUserName(token);
        boolean tokenExpired = isTokenExpired(token);
        return userName.equals(userDetails.getUsername()) && !tokenExpired;
    }

    private boolean isTokenExpired(String token) {
        return new Date().after(getExpirationTime(token));
    }

    public String getUserName(String token) {
        return getClaimsFromToken(token).getSubject();
    }

    public List<String> getRoles(String token) {
        return getClaimsFromToken(token).get("roles", List.class);
    }

    public Date getExpirationTime(String token) {
        return getClaimsFromToken(token).getExpiration();
    }

    private Claims getClaimsFromToken(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret));
    }

}
