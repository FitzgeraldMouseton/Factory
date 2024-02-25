package org.example.authservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.authservice.util.JwtTokenUtils;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final JwtTokenUtils jwtTokenUtils;
}
