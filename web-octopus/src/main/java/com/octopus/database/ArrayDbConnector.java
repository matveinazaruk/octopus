package com.octopus.database;

import java.util.Date;

import com.octopus.data.ServiceData;
import com.octopus.exceptions.OctopusTechnicalException;

public class ArrayDbConnector implements IDbConnector {
	
	static private ServiceData[][] database = new ServiceData[2][];
	private int table;
	

	public ArrayDbConnector(int table) {
		this.table = table;
	}

	@Override
	public ServiceData[] getData(Date start, Date end)
			throws OctopusTechnicalException {
		return database[table];
	}

	@Override
	public void setData(ServiceData[] data) throws OctopusTechnicalException {
		database[table] = data;		
	}

}
