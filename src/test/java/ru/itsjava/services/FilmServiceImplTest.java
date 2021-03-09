package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.dao.FilmDao;
import ru.itsjava.domain.Film;

import static org.mockito.Mockito.when;

@DisplayName("Класс FilmServiceImpl должен:")
@SpringBootTest
public class FilmServiceImplTest {

    @Configuration
    static class FilmServiceConfiguration{
        @Bean
        public FilmServiceImpl filmService() {
            return new FilmServiceImpl(filmDao());
        }

        @Bean
        public FilmDao filmDao() {
            FilmDao mock = Mockito.mock(FilmDao.class);
            when(mock
                    .findById(1L))
                    .thenReturn(new Film("Back to the future"));
            return mock;
        }
    }


    @Autowired
    FilmService filmService;

    //    @MockBean
//    FilmService2 filmService2;

    @Autowired
    FilmDao filmDao;

//    @DisplayName(" корректный конструктор")
//    @Test
//    public void shouldHaveCorrectConstructor(){
//        System.out.println(filmService);
//    }


    @DisplayName(" возращать корректное имя первого фильма ")
    @Test
    public void shouldHaveCorrectTitleFilm() {
        String actualTitle = filmService.getFirstFilmTitle();
        Assertions.assertEquals("Back to the future", actualTitle);
    }

}
