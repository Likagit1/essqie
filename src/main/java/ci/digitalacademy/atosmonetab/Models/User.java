package ci.digitalacademy.atosmonetab.Models;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
    @Setter
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "user")
   public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "pseudo" , nullable = false)
        private String pseudo;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "date_creation", nullable = false)
        @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        private LocalDateTime date_creation;


    @OneToOne
        private Adress adress;

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", pseudo='" + pseudo + '\'' +
                    ", password='" + password + '\'' +
                    ", creationDate=" + date_creation +
                    ", adress=" + adress.getCity() +
                    '}';
        }
    }


