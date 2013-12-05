package com.octopus.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.octopus.common.Date;
import com.octopus.data.JsonData;
import com.octopus.data.ServiceData;
import com.octopus.database.ArrayDataConnector;
import com.octopus.database.DatabaseFactory;
import com.octopus.database.IDataConnector;
import com.octopus.exceptions.OctopusTechnicalException;

@Controller
@RequestMapping("/data/")
public class DataController {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody JsonData getData() {
		ArrayDataConnector.updateData();
		DatabaseFactory factory = new DatabaseFactory();
		IDataConnector db = factory.getServiceDataBase("social");
		ServiceData[] social = null;
		ServiceData[] stock = null;
		try {
			social = db.getData(new Date(0), new Date(0));
			db = factory.getServiceDataBase("stock");
			stock = db.getData(new Date(0), new Date(0));
		} catch (OctopusTechnicalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new JsonData("social", social, "stock", stock);
	}
}
