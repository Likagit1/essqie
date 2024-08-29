package ci.digitalacademy.atosmonetab.Models;
import ci.digitalacademy.atosmonetab.Services.dto.FicheNoteDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value = "teacher")

public class Teacher extends Person{

    @Column(name = "vacant", nullable = false)
    private Boolean vacant;

    @Column(name = "ville", nullable = false)
    private String ville;

    @Column(name = "telephone", nullable = false)
    private String telephone;

    @Column(name = "matiereEnseigne", nullable = false)
    private String matiereEnseigne;

        @OneToMany(fetch = FetchType.EAGER , mappedBy = "teacher")
    private Set<FicheNote> ficheNotes;

    @Override
    public String toString() {
        return "Teacher{" +
                "vacant=" + vacant +
                ", ville='" + ville + '\'' +
                ", telephone='" + telephone + '\'' +
                ", matiereEnseigne='" + matiereEnseigne + '\'' +
                               ", ficheNotes=" + ficheNotes +
                '}';
    }
}






