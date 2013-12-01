package com.octopus.data;

public class JsonData {
	
	private String name;
	private ServiceData[] data;
	
	public JsonData(String name, ServiceData[] data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceData[] getData() {
		return data;
	}

	public void setData(ServiceData[] data) {
		this.data = data;
	}
}
