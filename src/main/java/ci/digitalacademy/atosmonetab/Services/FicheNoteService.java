package ci.digitalacademy.atosmonetab.Services;

import ci.digitalacademy.atosmonetab.Models.FicheNote;
import ci.digitalacademy.atosmonetab.Services.dto.FicheNoteDTO;

import java.util.List;
import java.util.Optional;

public interface FicheNoteService {

    FicheNoteDTO save(FicheNoteDTO ficheNote);

    FicheNoteDTO update(FicheNoteDTO ficheNote);

    Optional<FicheNoteDTO> findOne(Long id);

    List<FicheNoteDTO> findAll();

    void delete(Long id);
}
