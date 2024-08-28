package com.accioproj.bookMyShow.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketID;
    private String seats;
    private Integer AmtPaid;
    private LocalTime showTime;
    private LocalDate showDate;
    private String movieName;
    private String theaterNameAndAdd;

    @JoinColumn
    @ManyToOne
    private Show show;

    @JoinColumn
    @ManyToOne
    private User user;

    // Default constructor
    public Ticket() {}

    // All-args constructor
    public Ticket(Integer ticketID, String seats, Integer AmtPaid, LocalTime showTime, LocalDate showDate,
                  String movieName, String theaterNameAndAdd, Show show, User user) {
        this.ticketID = ticketID;
        this.seats = seats;
        this.AmtPaid = AmtPaid;
        this.showTime = showTime;
        this.showDate = showDate;
        this.movieName = movieName;
        this.theaterNameAndAdd = theaterNameAndAdd;
        this.show = show;
        this.user = user;
    }

	public Integer getTicketID() {
		return ticketID;
	}

	public void setTicketID(Integer ticketID) {
		this.ticketID = ticketID;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public Integer getAmtPaid() {
		return AmtPaid;
	}

	public void setAmtPaid(Integer amtPaid) {
		AmtPaid = amtPaid;
	}

	public LocalTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}

	public LocalDate getShowDate() {
		return showDate;
	}

	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheaterNameAndAdd() {
		return theaterNameAndAdd;
	}

	public void setTheaterNameAndAdd(String theaterNameAndAdd) {
		this.theaterNameAndAdd = theaterNameAndAdd;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
}