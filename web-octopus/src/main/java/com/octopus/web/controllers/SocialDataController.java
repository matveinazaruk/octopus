package com.octopus.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.octopus.data.JsonData;
import com.octopus.social.FakeSocialService;

@Controller
@RequestMapping("/data/social")
public class SocialDataController {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody JsonData getData() {
		FakeSocialService fakeService = new FakeSocialService();
		return new JsonData("social", fakeService.getData());
	}
}
