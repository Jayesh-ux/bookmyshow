package com.accioproj.bookMyShow.Entity;

import com.accioproj.bookMyShow.Enums.seatType;
import jakarta.persistence.*;

@Entity
@Table(name = "theaterSeat")
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer theaterSeatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private seatType seattype;

    @JoinColumn
    @ManyToOne
    private Theater theater;

    // Default constructor
    public TheaterSeat() {}

    // Constructor without theaterSeatId (as it's auto-generated)
    public TheaterSeat(String seatNo, seatType seattype, Theater theater) {
        this.seatNo = seatNo;
        this.seattype = seattype;
        this.theater = theater;
    }

    // Getters and setters
    public Integer getTheaterSeatId() {
        return theaterSeatId;
    }

    public void setTheaterSeatId(Integer theaterSeatId) {
        this.theaterSeatId = theaterSeatId;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public seatType getSeattype() {
        return seattype;
    }

    public void setSeattype(seatType seattype) {
        this.seattype = seattype;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}