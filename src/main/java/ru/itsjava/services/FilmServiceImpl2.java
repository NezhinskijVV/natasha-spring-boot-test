package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.FilmDao;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl2 implements FilmService2 {
    private final FilmDao filmDao;

    @Override
    public String getRandomFilmTitle() {
        return "Harry Potter";
    }


//    public FilmServiceImpl2() {
//        System.out.println("FilmServiceImpl2");
//    }


}
