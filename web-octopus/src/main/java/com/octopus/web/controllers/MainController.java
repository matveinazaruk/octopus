package com.octopus.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/graph")
public class MainController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String showGraph(ModelMap map) {
		map.addAttribute("text", "Octopus");
		return "graphics";
	}

}
