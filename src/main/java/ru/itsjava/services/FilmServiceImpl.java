package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.FilmDao;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService{
    private final FilmDao filmDao;

    @Override
    public String getFirstFilmTitle() {
        return filmDao.findById(1L).getTitle();
    }
}
