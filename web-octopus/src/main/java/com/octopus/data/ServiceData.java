package com.octopus.data;

import com.octopus.common.Date;


public class ServiceData {
	
	private long date;
	private double value;
	
	public ServiceData(long date, double value) {
		super();
		this.date = date;
		this.value = value;
	}
	
	public ServiceData(Date date, double value) {
		super();
		this.date = date.getMsec();
		this.value = value;
	}

	public long getDate() {
		return date;
	}
	
	public void setDate(long date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
}
