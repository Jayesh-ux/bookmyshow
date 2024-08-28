package com.accioproj.bookMyShow.Requests;

import com.accioproj.bookMyShow.Enums.seatType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class bookTicketRqst {
    private Integer showId;
    private List<String> seatNo;
    private seatType seattype;
    private String userMail;
    private boolean foodAttached;
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public List<String> getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(List<String> seatNo) {
		this.seatNo = seatNo;
	}
	public seatType getSeattype() {
		return seattype;
	}
	public void setSeattype(seatType seattype) {
		this.seattype = seattype;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public boolean isFoodAttached() {
		return foodAttached;
	}
	public void setFoodAttached(boolean foodAttached) {
		this.foodAttached = foodAttached;
	}
    
}
