package com.accioproj.bookMyShow.Entity;

import com.accioproj.bookMyShow.Enums.Genre;
import com.accioproj.bookMyShow.Enums.Languege;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(unique = true)
    private String movieName;

    @Enumerated(value = EnumType.STRING)
    private Languege movieLanguege;

    @Enumerated(value = EnumType.STRING)
    private Genre movieGenre;

    private String director;

    private LocalDate releaseDate;
    private Integer Duration;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Show> showList = new ArrayList<>();

    public Movie() {}

    public Movie(Integer movieId, String movieName, Languege movieLanguege, Genre movieGenre,
                 String director, LocalDate releaseDate, Integer Duration, List<Show> showList) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieLanguege = movieLanguege;
        this.movieGenre = movieGenre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.Duration = Duration;
        this.showList = showList;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Languege getMovieLanguege() {
        return movieLanguege;
    }

    public void setMovieLanguege(Languege movieLanguege) {
        this.movieLanguege = movieLanguege;
    }

    public Genre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(Genre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }

    public static MovieBuilder builder() {
        return new MovieBuilder();
    }

    public static class MovieBuilder {
        private Integer movieId;
        private String movieName;
        private Languege movieLanguege;
        private Genre movieGenre;
        private String director;
        private LocalDate releaseDate;
        private Integer Duration;
        private List<Show> showList = new ArrayList<>();

        public MovieBuilder movieId(Integer movieId) {
            this.movieId = movieId;
            return this;
        }

        public MovieBuilder movieName(String movieName) {
            this.movieName = movieName;
            return this;
        }

        public MovieBuilder movieLanguege(Languege movieLanguege) {
            this.movieLanguege = movieLanguege;
            return this;
        }

        public MovieBuilder movieGenre(Genre movieGenre) {
            this.movieGenre = movieGenre;
            return this;
        }

        public MovieBuilder director(String director) {
            this.director = director;
            return this;
        }

        public MovieBuilder releaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public MovieBuilder Duration(Integer Duration) {
            this.Duration = Duration;
            return this;
        }

        public MovieBuilder showList(List<Show> showList) {
            this.showList = showList;
            return this;
        }

        public Movie build() {
            return new Movie(movieId, movieName, movieLanguege, movieGenre, director, releaseDate, Duration, showList);
        }
    }
}
