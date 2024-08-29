package ci.digitalacademy.atosmonetab.Services;

import ci.digitalacademy.atosmonetab.Models.Teacher;
import ci.digitalacademy.atosmonetab.Services.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    TeacherDTO save(TeacherDTO teacher);

    TeacherDTO update(TeacherDTO teacher);

    Optional<TeacherDTO> findOne(Long id);

    List<TeacherDTO> findAll();

    void delete(Long id);

}