package ci.digitalacademy.atosmonetab.Repositories;

import ci.digitalacademy.atosmonetab.Models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
