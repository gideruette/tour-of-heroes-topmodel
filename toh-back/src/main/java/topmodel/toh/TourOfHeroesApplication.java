package topmodel.toh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import topmodel.toh.configuration.JpaConfiguration;
import topmodel.toh.configuration.WebappConfiguration;

@SpringBootApplication
@Import({ //
		JpaConfiguration.class, //
		WebappConfiguration.class })
public class TourOfHeroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourOfHeroesApplication.class, args);
	}
}
