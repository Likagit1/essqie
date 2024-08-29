package ci.digitalacademy.atosmonetab.Services.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO extends PersonDTO{
    private String matricule;
    private String telephone;
    private String ville;
    private String genre;
    private String classe;

}
