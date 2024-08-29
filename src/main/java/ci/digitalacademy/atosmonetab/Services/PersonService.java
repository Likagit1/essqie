package ci.digitalacademy.atosmonetab.Services;

import ci.digitalacademy.atosmonetab.Models.Person;
import ci.digitalacademy.atosmonetab.Services.dto.PersonDTO;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    PersonDTO save();

    PersonDTO save(PersonDTO person);

    PersonDTO update(PersonDTO person);

    Optional<PersonDTO> findOne(Long id);

    List<PersonDTO> findAll();

    void delete(Long id);

}
