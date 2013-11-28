package com.octopus.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.octopus.data.JSONDataConverter;
import com.octopus.social.FakeSocialService;

@Controller
@RequestMapping("/data/social")
public class SocialDataController {
	
	JSONDataConverter JSONComverter = new JSONDataConverter();
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String[][] getData() {
		FakeSocialService fakeService = new FakeSocialService();
		return JSONComverter.convert(fakeService.getData());
	}
}
