package com.octopus.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.octopus.data.SocialData;

@Controller
@RequestMapping("/data/social")
public class SocialDataController {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody SocialData getData() {
		SocialData data = new SocialData();
		data.setName("social_name");
		data.setValue("social_value");
		return data;
	}
}
