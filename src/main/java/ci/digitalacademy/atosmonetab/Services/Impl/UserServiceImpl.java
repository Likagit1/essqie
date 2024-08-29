package ci.digitalacademy.atosmonetab.Services.Impl;

import ci.digitalacademy.atosmonetab.Models.User;
import ci.digitalacademy.atosmonetab.Repositories.UserRepository;
import ci.digitalacademy.atosmonetab.Services.UserService;
import ci.digitalacademy.atosmonetab.Services.dto.UserDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor 
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public UserDTO save(UserDTO userDTO) {
        log.debug("Request to save : {}" , userDTO);
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toDto(user);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toDto(user);
    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return userRepository.findById(id).map(user -> {
            return userMapper.toDto(user);
        });
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(adress -> {
            return userMapper.toDto(adress);
        }).toList();
    }

    @Override
    public void delete(Long id) {
    }
}
