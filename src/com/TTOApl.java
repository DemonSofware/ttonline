package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tt.ITTConnector;



@Controller
@Scope("session")
@RequestMapping({"/"})
public class TTOApl {

	@Autowired
	ITTConnector ittconnector;
	
	@RequestMapping({"/"})
	public String index(Model model) {
		model.addAttribute("tattr", ittconnector.testFuncion());
		return "index";
	}
	
	
	
}
