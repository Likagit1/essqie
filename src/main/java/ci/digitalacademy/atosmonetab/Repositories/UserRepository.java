package ci.digitalacademy.atosmonetab.Repositories;

import ci.digitalacademy.atosmonetab.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
