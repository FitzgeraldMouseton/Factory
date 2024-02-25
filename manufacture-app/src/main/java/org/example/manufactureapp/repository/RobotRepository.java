package org.example.manufactureapp.repository;

import org.example.manufactureapp.domain.robots.Robot;
import org.example.manufactureapp.model.RobotFullResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RobotRepository extends JpaRepository<Robot, Integer> {


}