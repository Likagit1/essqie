package ci.digitalacademy.atosmonetab.Services.mapper;

import ci.digitalacademy.atosmonetab.Models.FicheNote;
import ci.digitalacademy.atosmonetab.Services.dto.FicheNoteDTO;

public class FicheNoteMapper {
    private FicheNoteMapper(){}

    public static FicheNoteDTO toDto(FicheNote ficheNote){
        FicheNoteDTO ficheNoteDTO = new FicheNoteDTO();
        ficheNoteDTO.setId(ficheNote.getId());
        ficheNoteDTO.setAnnee(ficheNote.getAnnee());
        ficheNoteDTO.setNote(ficheNote.getNote());
        return ficheNoteDTO;
    }

    public static FicheNote toEntity (FicheNoteDTO ficheNoteDTO){
        FicheNote ficheNote = new FicheNote();
        ficheNote.setId(ficheNoteDTO.getId());
        ficheNote.setAnnee(ficheNoteDTO.getAnnee());
        ficheNote.setNote(ficheNoteDTO.getNote());
        return ficheNote;
    }

}
