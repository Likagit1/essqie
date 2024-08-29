package ci.digitalacademy.atosmonetab.Services;

import ci.digitalacademy.atosmonetab.Models.User;
import ci.digitalacademy.atosmonetab.Services.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDTO save(UserDTO user);

    UserDTO update(UserDTO user);

    Optional<UserDTO> findOne(Long id);

    List<UserDTO> findAll();

    void delete(Long id);

}