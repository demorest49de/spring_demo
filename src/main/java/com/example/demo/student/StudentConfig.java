package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mariam = new Student(
              1L,
              "Mariam",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "mariam.jamal@gmail.com"
            );
            Student jamal = new Student(
                    2L,
                    "jamal",
                    LocalDate.of(1998, Month.DECEMBER, 6),
                    "jamal@gmail.com"
            );
            Student kirim = new Student(
                    3L,
                    "kirim",
                    LocalDate.of(1997, Month.DECEMBER, 6),
                    "kirim@gmail.com"
            );

            repository.saveAll(
                    List.of(mariam, jamal)
            );
        };
    }
}

