package com.octopus.stock;

import java.util.Random;

import com.octopus.data.ServiceData;
import com.octopus.database.DatabaseFactory;
import com.octopus.database.IDbConnector;
import com.octopus.exceptions.OctopusTechnicalException;

public class FakeStockService {
	
	public void addDate() {
		int number = 10;
		ServiceData[] serviceData = new ServiceData[number];
		Random rand = new Random();
		long currentDate = 978379982566L; //jan 1, 2001
		long day = 86400000L;
		for (int i = 0; i < number; i++) {
			currentDate = currentDate + ((long)rand.nextInt(30) + 1) * day;
		    serviceData[i] 
		    		= new ServiceData(currentDate, ((double)rand.nextInt(200)) / 10);
		}
		DatabaseFactory factory = new DatabaseFactory();
		IDbConnector connector = factory.getServiceDataBase("stock");
		try {
			connector.setData(serviceData);
		} catch (OctopusTechnicalException e) {
			e.printStackTrace();
		}
	}
}
