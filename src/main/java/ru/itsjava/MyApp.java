package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itsjava.services.FilmService;

@SpringBootApplication
public class MyApp {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyApp.class);
        System.out.println(context.getBean(FilmService.class));
    }
}
