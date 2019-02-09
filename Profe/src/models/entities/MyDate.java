package models.entities;

import java.util.Calendar;

import utilities.Utilities;

public class MyDate {
	
	protected Calendar date;
	
	
	public MyDate(Calendar date) {
		 this.setDate(date);
	}
	
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return Utilities.toStringCalendar(date); 
	}

}
