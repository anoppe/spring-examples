/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springmvc.oving8.kontroller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.oving8.domene.Person;

@Controller
public class PersonController {
	
	@RequestMapping(value = "/")
	public String Starter(@ModelAttribute(value="info")Person person) {
		System.out.println("Initialiserer...");
		return "/WEB-INF/jsp/index.jsp";
	}
	
	@RequestMapping(value = "addPerson")
	public String addPerson(@Valid @ModelAttribute(value="info")Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "/WEB-INF/jsp/index.jsp";
		}
		return "/WEB-INF/jsp/resultat.jsp";
	}
}
