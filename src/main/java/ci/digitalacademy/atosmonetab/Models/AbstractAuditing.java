package ci.digitalacademy.atosmonetab.Models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractAuditing  {

    private Instant creationDate;

    private String createdBy;
}
