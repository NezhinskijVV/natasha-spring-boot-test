package ru.itsjava.services;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.itsjava.dao.FilmDaoImpl;

@SpringBootTest
public class FilmServiceImpl2Test {

    @Configuration
    static class Conf{
        @Bean
        public FilmService2 filmService2() {
            return new FilmServiceImpl2(Mockito.mock(FilmDaoImpl.class));
        }
    }

    @Autowired
    FilmService2 filmService2;

    @Test
    public void test(){

    }
}
