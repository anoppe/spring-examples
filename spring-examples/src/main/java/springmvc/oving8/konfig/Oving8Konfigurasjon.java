package springmvc.oving8.konfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author jim-espengundersen
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = ("springmvc.oving8"))
public class Oving8Konfigurasjon {

//	@Bean
//		public InternalResourceViewResolver getInternalResourceViewResolver();
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix ("/WEB-INF/jsp/");
//		resolver.setSuffix (".jsp");
//		return resolver ;
}
