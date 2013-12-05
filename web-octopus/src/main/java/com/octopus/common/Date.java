package com.octopus.common;

public class Date {
	
	private long msec;

	public Date(long msec) {
		this.msec = msec;
	}

	public long getMsec() {
		return msec;
	}

	public void setMsec(long msec) {
		this.msec = msec;
	}
}
