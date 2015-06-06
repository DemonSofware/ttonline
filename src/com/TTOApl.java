package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tt.ITTConnector;
import tt.ITestTT;
import tt.TTData;

@Controller
@Scope("session")
@RequestMapping({"/"})
public class TTOApl {

	@Autowired
	ITTConnector ittconnector;
	
	@RequestMapping({"/"})
	public String index(Model model) {
		TTData ttData_Test = ittconnector.getTT(ITestTT.TEST_TTID);
		model.addAttribute("tattr", ttData_Test.toString());
		return "index";
	}
	
	
	
}
