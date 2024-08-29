package ci.digitalacademy.atosmonetab.Services.mapper.impl;

import ci.digitalacademy.atosmonetab.Models.Teacher;
import ci.digitalacademy.atosmonetab.Services.dto.TeacherDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TeacherMapperImpl implements TeacherMapper {

    private final ModelMapper modelMapper;

    @Override
    public TeacherDTO toDto(Teacher entity) {
        return modelMapper.map(entity, TeacherDTO.class);
    }

    @Override
    public Teacher toEntity(TeacherDTO dto) {
        return modelMapper.map(dto, Teacher.class);
    }
}
