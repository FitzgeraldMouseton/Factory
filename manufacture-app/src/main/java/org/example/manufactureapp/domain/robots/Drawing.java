package org.example.manufactureapp.domain.robots;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.manufactureapp.domain.personnel.Employee;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "schemas")
@NoArgsConstructor
@AllArgsConstructor
public class Drawing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private Instant createdAt;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee developer;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Detail> details = new ArrayList<>();
}
