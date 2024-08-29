package ci.digitalacademy.atosmonetab.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value = "student")
public class Student extends Person {

    @Column(name = "matricule" , nullable=false)
    private String matricule;

    @Column(name = "telephone" , nullable=false)
    private String telephone;

    @Column(name = "ville" , nullable=false)
    private String ville;

    @Column(name = "genre" , nullable=false)
    private String genre;

    @Column(name = "classe" , nullable=false)
    private String classe;

//    @Override
//    public String toString() {
//        return "Student{" +
//                "matricule='" + matricule + '\'' +
//                ", telephone='" + telephone + '\'' +
//                ", ville='" + ville + '\'' +
//                ", genre='" + genre + '\'' +
//                ", classe='" + classe + '\'' +
//                '}';
//    }
}
