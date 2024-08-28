package com.accioproj.bookMyShow.Requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class addUserRqst {
    private String name;
    private String phoneNo;
    private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
}
