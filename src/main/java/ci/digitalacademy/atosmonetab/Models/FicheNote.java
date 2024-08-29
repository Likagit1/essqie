package ci.digitalacademy.atosmonetab.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fiche_note")
public class FicheNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "note", nullable = false)
    private String note;

    @Column(name = "annee", nullable = false)
    private int annee;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Override
    public String toString() {
        return "FicheNote{" +
                "id=" + id +
                ", note='" + note + '\'' +
                ", annee=" + annee +
                ", teacher=" + teacher +
                '}';
    }
}
