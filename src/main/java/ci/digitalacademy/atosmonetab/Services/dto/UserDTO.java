package ci.digitalacademy.atosmonetab.Services.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String pseudo;
    private String password;
    private LocalDateTime date_creation;

}
