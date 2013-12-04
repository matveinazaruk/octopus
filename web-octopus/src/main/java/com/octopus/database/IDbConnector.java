package com.octopus.database;

import java.util.Date;

import com.octopus.data.ServiceData;
import com.octopus.exceptions.OctopusTechnicalException;

public interface IDbConnector {
	
	public abstract ServiceData[] getData(Date start, Date end) throws OctopusTechnicalException;
	public abstract void setData(ServiceData[] data) throws OctopusTechnicalException;
}
