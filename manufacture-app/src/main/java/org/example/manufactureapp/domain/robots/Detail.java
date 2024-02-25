package org.example.manufactureapp.domain.robots;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
