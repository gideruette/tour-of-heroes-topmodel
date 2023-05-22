package topmodel.toh.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { //
		"topmodel.toh.services", //
})
@PropertySource({ "classpath:application.yml" })
public class WebappConfiguration {
}
