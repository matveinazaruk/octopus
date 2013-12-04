package com.octopus.registry;

import com.octopus.common.IService;
import com.octopus.social.FakeSocialService;
import com.octopus.stock.FakeStockService;

public class ServiceRegistry {
	
	private static ServiceRegistry instance = new ServiceRegistry();
	
	private IService social;
	private IService stock;

	public ServiceRegistry() {
		social = new FakeSocialService();
		stock = new FakeStockService();
	}

	public static ServiceRegistry getInstance() {
		return instance;
	}

	public IService getSocial() {
		return social;
	}

	public IService getStock() {
		return stock;
	}
}
