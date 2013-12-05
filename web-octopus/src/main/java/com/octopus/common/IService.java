package com.octopus.common;

import com.octopus.data.ServiceData;

public interface IService {
	abstract public ServiceData[] getData(Date start, Date end);
}
