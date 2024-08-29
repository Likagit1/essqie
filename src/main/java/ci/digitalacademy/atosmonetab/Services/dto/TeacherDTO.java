package ci.digitalacademy.atosmonetab.Services.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO extends PersonDTO {
    private Boolean vacant;
    private String ville;
    private String telephone;
    private String matiereEnseigne;

}
