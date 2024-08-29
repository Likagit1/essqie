package ci.digitalacademy.atosmonetab.Services.Impl;

import ci.digitalacademy.atosmonetab.Repositories.PersonRepository;
import ci.digitalacademy.atosmonetab.Services.PersonService;
import ci.digitalacademy.atosmonetab.Services.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;


    @Override
    public PersonDTO save() {
        return null;
    }

    @Override
    public PersonDTO save(PersonDTO person) {
        return null;
    }

    @Override
    public PersonDTO update(PersonDTO person) {
        return null;
    }

    @Override
    public Optional<PersonDTO> findOne(Long id) {
        return null;
    }

    @Override
    public List<PersonDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

