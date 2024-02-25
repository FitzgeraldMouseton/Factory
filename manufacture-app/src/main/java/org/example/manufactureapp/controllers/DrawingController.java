package org.example.manufactureapp.controllers;

import org.example.manufactureapp.api.SchemaApi;
import org.example.manufactureapp.model.RobotSchemaRequest;
import org.example.manufactureapp.model.RobotSchemaResponse;
import org.springframework.http.ResponseEntity;

public class DrawingController implements SchemaApi {

    @Override
    public ResponseEntity<RobotSchemaResponse> createSchema(RobotSchemaRequest robotSchemaRequest) {
        return null;
    }
}
