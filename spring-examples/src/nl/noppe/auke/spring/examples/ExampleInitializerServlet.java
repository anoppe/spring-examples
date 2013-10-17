package nl.noppe.auke.spring.examples;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ExampleInitializerServlet implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		 AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // ctx.register(ApplicationContext.class); (change to your own config-class.
		Dynamic dispatcherServlet = servletContext.addServlet("mySpringAppServlet", new DispatcherServlet(ctx));
		dispatcherServlet.addMapping("/*"); // here you can use wildcards.
		// etc.
	}

}
