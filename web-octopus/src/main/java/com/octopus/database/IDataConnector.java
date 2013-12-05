package com.octopus.database;


import com.octopus.common.Date;
import com.octopus.data.ServiceData;
import com.octopus.exceptions.OctopusTechnicalException;

public interface IDataConnector {
	
	public abstract ServiceData[] getData(Date start, Date end) throws OctopusTechnicalException;
	public abstract void setData(ServiceData[] data) throws OctopusTechnicalException;
}
