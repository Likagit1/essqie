package ci.digitalacademy.atosmonetab.Repositories;

import ci.digitalacademy.atosmonetab.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long>{
}
