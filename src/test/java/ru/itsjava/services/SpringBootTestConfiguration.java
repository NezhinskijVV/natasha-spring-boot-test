package ru.itsjava.services;

import org.mockito.Mockito;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.dao.FilmDao;
import ru.itsjava.dao.FilmDaoImpl;
import ru.itsjava.domain.Film;

import static org.mockito.Mockito.when;

//@ComponentScan("ru.itsjava.services")
//@SpringBootConfiguration
public class SpringBootTestConfiguration {
//
//    @Bean
//    public FilmServiceImpl filmService(){
//        return new FilmServiceImpl(filmDao());
//    }
//
//    @Bean
//    public FilmDao filmDao(){
//        FilmDao mock = Mockito.mock(FilmDao.class);
//        when(mock
//                .findById(1L))
//                .thenReturn(new Film("Back to the future"));
//
//        return mock;
//    }
}
