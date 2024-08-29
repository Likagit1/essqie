package ci.digitalacademy.atosmonetab.Services.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private AdressDTO adressDTO;

}
