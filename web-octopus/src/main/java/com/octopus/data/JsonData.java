package com.octopus.data;

public class JsonData {
	
	private String socialName;
	private String stockName;
	private ServiceData[] socialData;
	private ServiceData[] stockData;
	
	public JsonData(String socialName, ServiceData[] socialData, String stockName,
			ServiceData[] stockData) {
		this.socialName = socialName;
		this.stockName = stockName;
		this.socialData = socialData;
		this.stockData = stockData;
	}

	public String getSocialName() {
		return socialName;
	}

	public void setSocialName(String socialName) {
		this.socialName = socialName;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public ServiceData[] getSocialData() {
		return socialData;
	}

	public void setSocialData(ServiceData[] socialData) {
		this.socialData = socialData;
	}

	public ServiceData[] getStockData() {
		return stockData;
	}

	public void setStockData(ServiceData[] stockData) {
		this.stockData = stockData;
	}

	
}
