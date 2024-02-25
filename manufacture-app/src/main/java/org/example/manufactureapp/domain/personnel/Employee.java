package org.example.manufactureapp.domain.personnel;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Role role;
}
