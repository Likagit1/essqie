package ci.digitalacademy.atosmonetab.Services.Impl;

import ci.digitalacademy.atosmonetab.Models.Teacher;
import ci.digitalacademy.atosmonetab.Repositories.TeacherRepository;
import ci.digitalacademy.atosmonetab.Services.TeacherService;
import ci.digitalacademy.atosmonetab.Services.dto.TeacherDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class TeacherServiceImpl  implements TeacherService {

    private final TeacherRepository teacherRepository;

    private final TeacherMapper teacherMapper;

    @Override
    public TeacherDTO save(TeacherDTO teacherDTO) {
        log.debug("Request to save : {}" , teacherDTO);
        Teacher teacher = teacherMapper.toEntity(teacherDTO);
        teacher = teacherRepository.save(teacher);
        return teacherMapper.toDto(teacher);
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        Teacher teacher = teacherMapper.toEntity(teacherDTO);
        teacher = teacherRepository.save(teacher);
        return teacherMapper.toDto(teacher);
    }

    @Override
    public Optional<TeacherDTO> findOne(Long id) {
        return teacherRepository.findById(id).map(teacher -> {
            return teacherMapper.toDto(teacher);
        });
    }

    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAll().stream().map(teacher -> {
            return teacherMapper.toDto(teacher);
        }).toList();
    }
    @Override
    public void delete(Long id) {
      teacherRepository.deleteById(id);
    }
}
