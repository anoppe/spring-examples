package nl.noppe.auke.spring.examples;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class ExampleInitializerServlet implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
//		 AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // ctx.register(ApplicationContext.class); (change to your own config-class.
//		Dynamic dispatcherServlet = servletContext.addServlet("mySpringAppServlet", new DispatcherServlet(ctx));
//		dispatcherServlet.addMapping("/*"); // here you can use wildcards.
		// etc.
	}

}
