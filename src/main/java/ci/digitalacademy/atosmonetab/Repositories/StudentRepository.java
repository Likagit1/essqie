package ci.digitalacademy.atosmonetab.Repositories;

import ci.digitalacademy.atosmonetab.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
