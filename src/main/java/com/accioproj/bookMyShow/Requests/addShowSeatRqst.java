package com.accioproj.bookMyShow.Requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class addShowSeatRqst {
    private Integer showId;
    private Integer priceOfPrimium;
    private Integer priceOfClassic;
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Integer getPriceOfPrimium() {
		return priceOfPrimium;
	}
	public void setPriceOfPrimium(Integer priceOfPrimium) {
		this.priceOfPrimium = priceOfPrimium;
	}
	public Integer getPriceOfClassic() {
		return priceOfClassic;
	}
	public void setPriceOfClassic(Integer priceOfClassic) {
		this.priceOfClassic = priceOfClassic;
	}
    
}
