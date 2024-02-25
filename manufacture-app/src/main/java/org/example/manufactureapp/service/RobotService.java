package org.example.manufactureapp.service;

import lombok.RequiredArgsConstructor;
import org.example.manufactureapp.domain.robots.Robot;
import org.example.manufactureapp.domain.robots.RobotStatus;
import org.example.manufactureapp.mappers.RobotMapper;
import org.example.manufactureapp.model.RobotFullResponse;
import org.example.manufactureapp.model.RobotRequest;
import org.example.manufactureapp.repository.DrawingRepository;
import org.example.manufactureapp.repository.EmployeeRepository;
import org.example.manufactureapp.repository.RobotRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class RobotService {

    private final RobotRepository robotRepository;
    private final EmployeeRepository employeeRepository;
    private final DrawingRepository drawingRepository;

    private final RobotMapper robotMapper = RobotMapper.INSTANCE;

    public RobotFullResponse addRobot(RobotRequest request) {
        Robot robot = Robot.builder()
                .createdAt(Instant.now())
                .assembler(employeeRepository.getEmployeeById(request.getEmployee().intValue()))
                .drawing(drawingRepository.getDrawingById(request.getDrawing()))
                .status(RobotStatus.CONSTRUCTED)
                .build();
        RobotFullResponse robotFullResponse = robotMapper.fromRobotToFullResponse(robot);
        robotRepository.save(robot);
        return robotFullResponse;
    }
}
