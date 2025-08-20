package com.citas.alumno;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlumnoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlumnoServiceApplication.class, args);
    }

    @PostConstruct
    public void printEnv() {
        System.out.println("MYSQLHOST: " + System.getenv("MYSQLHOST"));
        System.out.println("MYSQLPORT: " + System.getenv("MYSQLPORT"));
        System.out.println("MYSQLDATABASE: " + System.getenv("MYSQLDATABASE"));
        System.out.println("MYSQLUSER: " + System.getenv("MYSQLUSER"));
    }

}
