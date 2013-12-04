package com.octopus.common;

import java.util.Date;

import com.octopus.data.ServiceData;

public interface IService {
	abstract public ServiceData[] getData(Date start, Date end);
}
