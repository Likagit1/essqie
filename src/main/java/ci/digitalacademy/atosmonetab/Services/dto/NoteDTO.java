package ci.digitalacademy.atosmonetab.Services.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteDTO {

    private Long id;
    private int note;
    private String matiere;

}
