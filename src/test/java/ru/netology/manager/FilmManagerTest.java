package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private FilmManager manager = new FilmManager();
    private Film first = new Film(1, "Toy Story", "ts", "Animation", false);
    private Film second = new Film(2, "Ice Age", "ia", "Animation", false);
    private Film third = new Film(3, "Inception", "i", "Science fiction", false);


    @BeforeEach
    void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
    }

    @Test
    void shouldGetAll() {
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddFilm() {
        Film fourth = new Film(4, "Cars", "c", "Animation", false);
        manager.addFilm(fourth);
        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetSeveral() {
        manager.filmsQuantity(2);
        Film[] actual = manager.getSeveral();
        Film[] expected = new Film[]{third, second};
        assertArrayEquals(expected, actual);
    }
}