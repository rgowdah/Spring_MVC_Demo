package com.rgowdah.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SIllyController {
	@RequestMapping("/showForm")
	public String displayForm(){
		return "silly";

	}
}
