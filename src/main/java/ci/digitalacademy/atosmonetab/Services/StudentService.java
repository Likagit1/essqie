package ci.digitalacademy.atosmonetab.Services;

import ci.digitalacademy.atosmonetab.Models.Student;
import ci.digitalacademy.atosmonetab.Services.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {

     StudentDTO save(StudentDTO student);

    StudentDTO update(StudentDTO student);

    Optional<StudentDTO> findOne(Long id);

    List<StudentDTO> findAll();

    void delete(Long id);

}
