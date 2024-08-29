package ci.digitalacademy.atosmonetab;

import ci.digitalacademy.atosmonetab.Models.*;
import ci.digitalacademy.atosmonetab.Services.*;
import ci.digitalacademy.atosmonetab.Services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class AtosmonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
    @Autowired
    private AdressService adressService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private FicheNoteService ficheNoteService;
	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(AtosmonetabApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}



