package ci.digitalacademy.atosmonetab.Services.mapper.impl;

import ci.digitalacademy.atosmonetab.Models.User;
import ci.digitalacademy.atosmonetab.Services.dto.UserDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapperImpl implements UserMapper {

private final ModelMapper modelMapper;

    @Override
    public UserDTO toDto(User entity) {
        return modelMapper.map(entity, UserDTO.class);
    }

    @Override
    public User toEntity(UserDTO dto) {
        return modelMapper.map(dto, User.class);
    }
}
