package org.example.manufactureapp.domain.robots;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "VACUUM_LAMP")
public class VacuumLamp extends Detail {
}
