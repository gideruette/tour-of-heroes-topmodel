package topmodel.toh.api.server.heroes;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import topmodel.toh.dtos.heroes.HeroDto;
import topmodel.toh.services.heroes.HeroesService;

@RestController
public class HeroesControllerImpl implements HeroesController {

	private final HeroesService heroesService;

	public HeroesControllerImpl(HeroesService heroesService) {
		this.heroesService = heroesService;
	}

	@Override
	public List<HeroDto> searchHeroes(String term) {
		return heroesService.searchHeroes(term);
	}
}
