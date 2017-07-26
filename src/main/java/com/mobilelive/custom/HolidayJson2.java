package com.mobilelive.custom;

public class HolidayJson2 {
	private int status;
	private String error;
	
	public HolidayJson2(){
		
	}
	
	public HolidayJson2(int status, String error) {
		super();
		this.status = status;
		this.error = error;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
