package ru.netology;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.models.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<Student> studentList = Arrays.asList(
                new Student(1, "Владимир", "Анисимов", "Netology", "2021-09-29"),
                new Student(2, "Алина", "Сазонова", "Netology", "2021-10-10"),
                new Student(3, "Алексей", "Леонов", "Netology", "2021-10-15"),
                new Student(4, "Олег", "Седов", "Netology", "2021-11-01")
        );

        studentList.forEach(student -> {
            em.persist(student);
        });
    }
}
