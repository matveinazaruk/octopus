package com.octopus.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data/test")
public class TestJSONController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String[] getData() {
		String[] data = new String[2];
		data[0] = "data";
		data[1] = "1";
		return data;
	}
}
