package ci.digitalacademy.atosmonetab.Services.Impl;
import ci.digitalacademy.atosmonetab.Models.Student;
import ci.digitalacademy.atosmonetab.Repositories.StudentRepository;
import ci.digitalacademy.atosmonetab.Services.StudentService;
import ci.digitalacademy.atosmonetab.Services.dto.StudentDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        log.debug("Request to save : {}" , studentDTO);
        Student student = studentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);
        return studentMapper.toDto(student);
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        log.debug("Request to update : {}" , studentDTO);
        Student student = studentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);
        return studentMapper.toDto(student);
    }

    @Override
    public Optional<StudentDTO> findOne(Long id) {
        return studentRepository.findById(id).map(student -> {
            return studentMapper.toDto(student);
        });
    }

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll().stream().map(student -> {
            return studentMapper.toDto(student);
        }).toList();
    }
    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
