package ci.digitalacademy.atosmonetab.Services;

import ci.digitalacademy.atosmonetab.Models.Note;
import ci.digitalacademy.atosmonetab.Services.dto.NoteDTO;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    NoteDTO save(NoteDTO note);

    NoteDTO update(NoteDTO note);

    Optional<NoteDTO> findOne(Long id);

    List<NoteDTO> findAll();

    void delete(Long id);
}
