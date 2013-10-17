package nl.noppe.auke.spring.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/") // it is possible to defina a requestmapping for the whole controller.
public class ExampleController {

	@RequestMapping(value="/", method=RequestMethod.GET) // this endpoint will only react on requests that match one of the defined RequestMethds
	public String indexPage(@ModelAttribute("person") Person person) { 	// you better use a modelAttribute identifier string that indicates what kind of data it contains.
		return "/WEB-INF/jsp/index.jsp";
	}
	
}


