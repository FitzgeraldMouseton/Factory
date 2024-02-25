package org.example.manufactureapp.repository;

import org.example.manufactureapp.domain.personnel.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee getEmployeeById(Integer id);
}