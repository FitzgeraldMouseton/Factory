package org.example.manufactureapp.domain.robots;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "GEAR")
public class Gear extends Detail {
}
