package org.example.manufactureapp.repository;

import org.example.manufactureapp.domain.robots.Drawing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrawingRepository extends JpaRepository<Drawing, Integer> {

    Drawing getDrawingById(Integer id);
}