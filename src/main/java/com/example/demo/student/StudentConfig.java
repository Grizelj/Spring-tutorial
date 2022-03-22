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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student dunja = new Student(
                            "dunja",
                            "dunja.markulak@gmail.com",
                            LocalDate.of(1999, Month.OCTOBER, 11)
                    );

            Student zvonimir = new Student(
                        "zvonimir",
                        "zvonimir.grizelj@gmail.com",
                        LocalDate.of(1996, Month.SEPTEMBER,14)
                );
            repository.saveAll(
                    List.of(dunja, zvonimir)
            );
        };
    }
}
