package ci.digitalacademy.atosmonetab.Controller;

import ci.digitalacademy.atosmonetab.Models.Student;
import ci.digitalacademy.atosmonetab.Services.StudentService;
import ci.digitalacademy.atosmonetab.Services.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
@Slf4j
@RequiredArgsConstructor
public class StudentsController {

    private final StudentService studentService;

    @PostMapping
    public String saveStudent(StudentDTO student){
        log.debug("Request to save student :{}",student);
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/add")
    public String showAddStudents(Model model){
        log.debug("Request to show add students ");
        model.addAttribute("student" ,new StudentDTO());
        return "students/forms";
    }

    @GetMapping("/{id}")
    public String showUpdateStudentsForms (Model model , @PathVariable Long id){
        log.debug("Request to show update students forms");
        Optional<StudentDTO> student = studentService.findOne(id);
        if (student.isPresent()){
            model.addAttribute("student", student.get());
            return "students/forms";
        }else {
            return "redirect:/students";
        }

    }
    @GetMapping
    public String showStudentPage(Model model) {
        List<StudentDTO> students = studentService.findAll();
        model.addAttribute("students" , students);
        return "students/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        studentService.delete(id);
        return "redirect:/students";
    }

}
