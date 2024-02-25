package org.example.manufactureapp.mappers;

import org.example.manufactureapp.domain.robots.Robot;
import org.example.manufactureapp.model.RobotFullResponse;
import org.example.manufactureapp.model.RobotRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RobotMapper {
    RobotMapper INSTANCE = Mappers.getMapper(RobotMapper.class);

//    @Mapping(target = "drawing.id", source = "drawing")
//    @Mapping(target = "drawing.id", source = "drawing")
//    @Mapping(target = "drawing.id", source = "drawing")
//    Robot fromRequest(RobotRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "category", ignore = true)
    @Mapping(target = "employee", ignore = true)
    @Mapping(target = "store", ignore = true)
    RobotFullResponse fromRobotToFullResponse(Robot robot);
}
