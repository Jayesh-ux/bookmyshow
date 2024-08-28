package com.accioproj.bookMyShow.Requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class addTheaterSeatRqst {
    private Integer noOfPrimiumSeat;
    private Integer noOfClassicSeat;
    private Integer noOfCol;
    private Integer theaterId;
	public Integer getNoOfPrimiumSeat() {
		return noOfPrimiumSeat;
	}
	public void setNoOfPrimiumSeat(Integer noOfPrimiumSeat) {
		this.noOfPrimiumSeat = noOfPrimiumSeat;
	}
	public Integer getNoOfClassicSeat() {
		return noOfClassicSeat;
	}
	public void setNoOfClassicSeat(Integer noOfClassicSeat) {
		this.noOfClassicSeat = noOfClassicSeat;
	}
	public Integer getNoOfCol() {
		return noOfCol;
	}
	public void setNoOfCol(Integer noOfCol) {
		this.noOfCol = noOfCol;
	}
	public Integer getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}
    
}
