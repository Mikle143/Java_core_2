package ru.vdovinmb.javaCore2.homeWork6;

import java.util.*;

public class Film {
    private int id;
    private int year;
    private Month month;
    private Genre genre;
    private double rating;

    public Film(int id, int year, Month month, Genre genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addFilm(Set<Film> filmSet2020, Set<Film> filmSet2021, Set<Film> filmSet2022) { //добавляет новый фильм, в зависимости от года в нужный сет
        switch (year) {
            case 2020 -> filmSet2020.add(this);
            case 2021 -> filmSet2021.add(this);
            case 2022 -> filmSet2022.add(this);
            default -> System.out.println("Указан неверный формат года");
        }

    }

    public static Set<Film> getFilmOnYearMonth(Integer year, Month month, Cinema cinema) { //достать все фильмы по году и месяцу
        Set<Film> filmSet = cinema.getCinemaMap().get(year);
        Set<Film> newfilmSet = new HashSet<>();
        for (Film film : filmSet) {
            if (film.getMonth() == month) {
                newfilmSet.add(film);
            }
        }
        return newfilmSet;
    }

    public static Set<Film> getFilmOnGenre(Genre genre, Cinema cinema) { //достать все фильмы по жанру
        Collection<Set<Film>> setCollection = cinema.getCinemaMap().values();// достал все сеты фильмов в коллекцию сетов
        Iterator<Set<Film>> listIterator = setCollection.iterator();// создал итератор, чтобы перебрать сеты фильмов
        Set<Film> films = new HashSet<>(); //создал сет фильмов, куда сложу фильмы из всех сетов
        Set<Film> newfilmSet = new HashSet<>();//создал сет фильмов, куда сложу фильмы указанного жанра
        while (listIterator.hasNext()) {
            films.addAll(listIterator.next()); //сложил фильмы из всех сетов в один "films"
        }
        for (Film film : films) {
            if (film.getGenre() == genre) {
                newfilmSet.add(film);
            }
        }
        return newfilmSet;
    }

    public static List<Film> getFilmOnRating(Cinema cinema, Integer n) { //достать все фильмы по рейтингу
        Collection<Set<Film>> setCollection = cinema.getCinemaMap().values();// достал все сеты фильмов в коллекцию сетов
        Iterator<Set<Film>> listIterator = setCollection.iterator();// создал итератор, чтобы перебрать сеты фильмов
        List<Film> films = new ArrayList<>();//создал лист фильмов, куда сложу фильмы из всех сетов
        List<Film> newfilms = new ArrayList<>(); //создал лист фильмов, куда сложу указанное количество фильмов по рейтингу
        while (listIterator.hasNext()) {
            films.addAll(listIterator.next()); //сложил фильмы из всех сетов в один лист "films"
        }
        Comparator<Film> filmComparator = new ComparatorRating();
        Collections.sort(films, filmComparator);

        for (int i = 0; i < n; i++) {
            newfilms.add(films.get(i));
        }
        return newfilms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film film)) return false;
        return getId() == film.getId() && getYear() == film.getYear() && Double.compare(film.getRating(), getRating()) == 0 && getMonth() == film.getMonth() && getGenre() == film.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getYear(), getMonth(), getGenre(), getRating());
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}
