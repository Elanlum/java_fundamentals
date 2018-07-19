package task4;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class FilmCollectionTest {

    private FilmCollection filmCollection;
    private Actor anjelina;
    private Actor brad;

    @BeforeEach
    public void setUp() {
        filmCollection = new FilmCollection();
        anjelina = new Actor("Angelina", "Jolie", LocalDate.of(1975, Month.APRIL, 4));
        brad = new Actor("Brad", "Pitt", LocalDate.of(1963, Month.DECEMBER, 18));
        filmCollection.addFilm(new Film("Troy", 2004, brad), brad);
        filmCollection.addFilm(new Film("The Tourist", 2010, anjelina), anjelina);
    }

    @Test
    public void saveUploadCollectionTest() {
        filmCollection.saveFilmCollection();
        filmCollection.addFilm(new Film("The Tourist", 2010, anjelina), anjelina);
        filmCollection.addFilm(new Film("Mr and Mrs Smith", 2005, brad), brad);
        filmCollection.saveFilmCollection();
        filmCollection.uploadFilmCollection();
        assertThat(filmCollection.getActor(new Film("The Tourist", 2010, anjelina)), is (anjelina));
        assertThat(filmCollection.getActor(new Film("Mr and Mrs Smith", 2005, brad)), is (brad));
        assertThat(filmCollection.getActor(new Film("Troy", 2004, brad)), is(brad));
        assertThat(filmCollection.getActor(new Film("The Tourist", 2010, anjelina)), is(anjelina));
    }
}