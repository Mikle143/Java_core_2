package ru.vdovinmb.javaCore2.homeWork6;

import java.util.*;

public class CinemaRunner {
    public static void main(String[] args) {
        Film film1 = new Film(1, 2022, Month.MARCH, Genre.TRILLER, 8.6);
        Film film2 = new Film(2, 2022, Month.FEBRUARY, Genre.COMEDY, 6.6);
        Film film3 = new Film(3, 2022, Month.MAY, Genre.HISTORICAL, 8.3);
        Film film4 = new Film(4, 2021, Month.JULY, Genre.HISTORICAL, 9.6);
        Film film5 = new Film(5, 2021, Month.JANUARY, Genre.TRILLER, 8.1);
        Film film6 = new Film(6, 2021, Month.JUNE, Genre.COMEDY, 7.6);
        Film film7 = new Film(7, 2021, Month.NOVEMBER, Genre.FANTASTIC, 8.6);
        Film film8 = new Film(8, 2020, Month.SEPTEMBER, Genre.FANTASTIC, 7.8);
        Film film9 = new Film(9, 2020, Month.SEPTEMBER, Genre.TRILLER, 4.4);
        Film film10 = new Film(10, 2020, Month.MARCH, Genre.TRILLER, 7.3);
        Film film11 = new Film(10, 2020, Month.MARCH, Genre.TRILLER, 7.3);
        Film film12 = new Film(10, 2020, Month.MARCH, Genre.TRILLER, 7.3);

        Set<Film> filmSet2020 = new HashSet<>();//создал сеты с фильмами по годам
        Set<Film> filmSet2021 = new HashSet<>();
        Set<Film> filmSet2022 = new HashSet<>();

        film1.addFilm(filmSet2020, filmSet2021, filmSet2022); //добавил новый фильм
        film2.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film3.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film4.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film5.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film6.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film7.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film8.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film9.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film10.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film11.addFilm(filmSet2020, filmSet2021, filmSet2022);
        film12.addFilm(filmSet2020, filmSet2021, filmSet2022);

        Map<Integer, Set<Film>> cinemaMap = new LinkedHashMap<>();//создал мэп, где ключ - год, объект - сет фильмов, соответствующий году.
        cinemaMap.put(2020, filmSet2020);
        cinemaMap.put(2021, filmSet2021);
        cinemaMap.put(2022, filmSet2022);

        Cinema cinema = new Cinema(cinemaMap); //создал объект кинотеатр

        System.out.println(cinema.getCinemaMap().get(2020));//получил все фильмы по переданному коду
        System.out.println();
        System.out.println(Film.getFilmOnYearMonth(2021, Month.JULY, cinema));//получил все фильмы по переданному коду и месяцу
        System.out.println();
        System.out.println(Film.getFilmOnGenre(Genre.COMEDY, cinema));//получил все фильмы по жанру
        System.out.println();
        System.out.println(Film.getFilmOnRating(cinema, 3));

    }
}
