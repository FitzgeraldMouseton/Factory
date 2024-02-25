package org.example.manufactureapp.controllers;

import lombok.RequiredArgsConstructor;
//import org.example.manufactureapp.api.RobotApi;
import org.example.manufactureapp.model.ModelApiResponse;
import org.example.manufactureapp.model.RobotFullResponse;
import org.example.manufactureapp.model.RobotRequest;
import org.example.manufactureapp.repository.RobotRepository;
import org.example.manufactureapp.service.RobotService;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RobotController {

    private final RobotService robotService;

//    @Override
    @PostMapping("/robot/create")
    public ResponseEntity<RobotFullResponse> addRobot(@RequestBody RobotRequest robotRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(robotService.addRobot(robotRequest));
    }

    //    @Override
    public ResponseEntity<Void> deleteRobot(Long robotId) {
        return null;
    }

//    @Override
    public ResponseEntity<List<RobotFullResponse>> findRobotByStatus(String id) {
        return null;
    }

//    @Override
    public ResponseEntity<RobotFullResponse> getRobotById(Long robotId) {
        return null;
    }

//    @Override
    public ResponseEntity<RobotRequest> updateRobot(RobotRequest robotRequest) {
        return null;
    }

//    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long robotId, String additionalMetadata, Resource body) {
        return null;
    }
}
