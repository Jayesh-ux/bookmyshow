package com.accioproj.bookMyShow.Entity;

import com.accioproj.bookMyShow.Enums.seatType;
import jakarta.persistence.*;

@Entity
@Table(name = "showSeat")
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showSeatId;
    private Integer price;
    private Boolean Available;
    private Boolean foodAttached;
    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private seatType seattype;

    @ManyToOne
    @JoinColumn
    private Show show;

    // Constructors, getters, and setters

    public ShowSeat() {}

    public ShowSeat(Integer showSeatId, Integer price, Boolean Available, Boolean foodAttached, 
                    String seatNo, seatType seattype, Show show) {
        this.showSeatId = showSeatId;
        this.price = price;
        this.Available = Available;
        this.foodAttached = foodAttached;
        this.seatNo = seatNo;
        this.seattype = seattype;
        this.show = show;
    }

	public Integer getShowSeatId() {
		return showSeatId;
	}

	public void setShowSeatId(Integer showSeatId) {
		this.showSeatId = showSeatId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Boolean getAvailable() {
		return Available;
	}

	public void setAvailable(Boolean available) {
		Available = available;
	}

	public Boolean getFoodAttached() {
		return foodAttached;
	}

	public void setFoodAttached(Boolean foodAttached) {
		this.foodAttached = foodAttached;
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

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

    
}