package ci.digitalacademy.atosmonetab.Services.mapper.impl;

import ci.digitalacademy.atosmonetab.Models.Student;
import ci.digitalacademy.atosmonetab.Services.dto.StudentDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentMapperImpl implements StudentMapper {

    private final ModelMapper modelMapper;

    @Override
    public StudentDTO toDto(Student entity) {
        return modelMapper.map(entity, StudentDTO.class);
    }

    @Override
    public Student toEntity(StudentDTO dto) {
        return modelMapper.map(dto, Student.class);
    }
}

