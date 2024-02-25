package org.example.manufactureapp.domain.robots;

import jakarta.persistence.*;
import lombok.*;
import org.example.manufactureapp.domain.personnel.Employee;

import java.time.Instant;

@Entity
@Getter
@Setter
@Builder
@Table(name = "robots")
@NoArgsConstructor
@AllArgsConstructor
public class Robot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Instant createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assembler_id")
    private Employee assembler;

    @ManyToOne(fetch = FetchType.LAZY)
    private Drawing drawing;

    private RobotStatus status;
}
