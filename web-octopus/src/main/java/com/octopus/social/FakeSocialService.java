package com.octopus.social;


import java.util.Random;

import com.octopus.common.Date;
import com.octopus.common.IService;
import com.octopus.data.ServiceData;

public class FakeSocialService implements IService {
	
	public ServiceData[] getData(Date start, Date end) {
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
		return serviceData;
	}
}
