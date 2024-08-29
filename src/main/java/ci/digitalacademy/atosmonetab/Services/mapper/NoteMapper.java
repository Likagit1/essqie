package ci.digitalacademy.atosmonetab.Services.mapper;

import ci.digitalacademy.atosmonetab.Models.Note;
import ci.digitalacademy.atosmonetab.Services.dto.NoteDTO;

public class NoteMapper {

    public static NoteDTO toDto(Note note){
        NoteDTO noteDTO = new NoteDTO();
        noteDTO.setId(note.getId());
        noteDTO.setMatiere(note.getMatiere());
        noteDTO.setNote(note.getNote());
        return noteDTO;
    }

    public static Note toEntity (NoteDTO noteDTO){
        Note note = new Note();
        note.setId(noteDTO.getId());
        note.setMatiere(noteDTO.getMatiere());
        note.setNote(noteDTO.getNote());
        return note;
    }
}
