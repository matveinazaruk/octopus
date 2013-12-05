package com.octopus.database;


import com.octopus.common.Date;
import com.octopus.common.IService;
import com.octopus.data.ServiceData;
import com.octopus.exceptions.OctopusTechnicalException;
import com.octopus.registry.ServiceRegistry;

public class ArrayDataConnector implements IDataConnector {
	
	static private ServiceData[][] database = new ServiceData[2][];
	private int table;
	
	static {
		updateData();
	}
	

	public ArrayDataConnector(int table) {
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
	
	static public void updateData() {
		ServiceRegistry registry = ServiceRegistry.getInstance();
		IService socialService = registry.getSocial();
		IService stockService = registry.getStock();
		database[0] = socialService.getData(null, null);
		database[1] = stockService.getData(null, null);
	}

}
