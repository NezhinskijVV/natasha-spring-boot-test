package ru.itsjava.dao;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.Film;

@Repository
public class FilmDaoImpl implements FilmDao {

    public FilmDaoImpl() {
        System.out.println("FilmDaoImpl");
    }

    @Override
    public Film findById(long id) {
        return new Film("Back to the future");
    }
}
