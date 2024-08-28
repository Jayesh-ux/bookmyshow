package com.accioproj.bookMyShow.Requests;

import com.accioproj.bookMyShow.Enums.Genre;
import com.accioproj.bookMyShow.Enums.Languege;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class addMovieRqst {
    private String movieName;
    private Languege movieLanguege;

    private Genre movieGenre;

    private String director;

    private LocalDate releaseDate;
    private Integer Duration;
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
	public void setDuration(Integer duration) {
		Duration = duration;
	}
    
}
