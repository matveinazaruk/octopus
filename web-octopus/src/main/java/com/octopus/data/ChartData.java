package com.octopus.data;

import java.util.Date;

public class ChartData {
	
	private Date date;
	private double value;
	
	public ChartData(Date date, double value) {
		super();
		this.date = date;
		this.value = value;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@SuppressWarnings("deprecation")
	public String getDateStr() {
		return String.format("Date.UTC(%d, %d, %d)", date.getYear(),
				date.getMonth(), date.getDay());
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getValueStr() {
		return Double.toString(value);
	}
}
