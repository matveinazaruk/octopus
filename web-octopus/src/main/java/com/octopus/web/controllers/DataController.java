package com.octopus.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.octopus.data.JsonData;
import com.octopus.data.ServiceData;
import com.octopus.database.DatabaseFactory;
import com.octopus.database.IDbConnector;
import com.octopus.exceptions.OctopusTechnicalException;
import com.octopus.social.FakeSocialService;
import com.octopus.stock.FakeStockService;

@Controller
@RequestMapping("/data/")
public class DataController {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody JsonData getData() {
		FakeSocialService fakeSocial = new FakeSocialService();
		FakeStockService fakeStock = new FakeStockService();
		fakeSocial.addDate();
		fakeStock.addDate();
		DatabaseFactory factory = new DatabaseFactory();
		IDbConnector db = factory.getServiceDataBase("social");
		ServiceData[] social = null;
		ServiceData[] stock = null;
		try {
			social = db.getData(null, null);
			db = factory.getServiceDataBase("stock");
			stock = db.getData(null, null);
		} catch (OctopusTechnicalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new JsonData("social", social, "stock", stock);
	}
}
