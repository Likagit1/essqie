package ci.digitalacademy.atosmonetab.Services.mapper.impl;

import ci.digitalacademy.atosmonetab.Models.Adress;
import ci.digitalacademy.atosmonetab.Models.Student;
import ci.digitalacademy.atosmonetab.Services.dto.AdressDTO;
import ci.digitalacademy.atosmonetab.Services.dto.StudentDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.AdressMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdressMapperImpl implements AdressMapper {

private final ModelMapper modelMapper;

    @Override
    public AdressDTO toDto(Adress entity) {
        return modelMapper.map(entity, AdressDTO.class);
    }

    @Override
    public Adress toEntity(AdressDTO dto) {
        return modelMapper.map(dto, Adress.class);
    }
}
