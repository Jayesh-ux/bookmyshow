package com.accioproj.bookMyShow.Requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class addTheaterRqst {
    private String theaterName;
    private String theaterAddress;
    private Integer noOfScreen;
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterAddress() {
		return theaterAddress;
	}
	public void setTheaterAddress(String theaterAddress) {
		this.theaterAddress = theaterAddress;
	}
	public Integer getNoOfScreen() {
		return noOfScreen;
	}
	public void setNoOfScreen(Integer noOfScreen) {
		this.noOfScreen = noOfScreen;
	}
    
}
