package ci.digitalacademy.atosmonetab.Controller;

import ci.digitalacademy.atosmonetab.Models.Teacher;
import ci.digitalacademy.atosmonetab.Services.TeacherService;
import ci.digitalacademy.atosmonetab.Services.dto.TeacherDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RequestMapping("/teachers")
@Slf4j
@RequiredArgsConstructor
public class TeachersController {

    private final TeacherService teacherService;


    @GetMapping
    public String showTeachersPage(Model model) {
        log.debug("Request to show teachers ");
        List<TeacherDTO> teachers = teacherService.findAll();
        model.addAttribute("teachers" , teachers);
        return "teachers/list";
    }

    @PostMapping
    public String saveTeacher(TeacherDTO teacher){
        log.debug("Request to save teacher :{}",teacher);
        teacherService.save(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/add")
    public String showAddTeachers(Model model){
        log.debug("Request to show add teachers ");
        model.addAttribute("teacher" ,new Teacher());
        return "teachers/forms";
    }

    @GetMapping("/{id}")
    public String showUpdateTeachersForms (Model model , @PathVariable Long id){
        log.debug("Request to show update teachers forms");
        Optional <TeacherDTO> teacher = teacherService.findOne(id);
        if (teacher.isPresent()){
            model.addAttribute("teacher", teacher.get());
            return "teachers/forms";
        }else {
            return "redirect:/teachers";
        }

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        teacherService.delete(id);
        return "redirect:/teachers";
    }


}
