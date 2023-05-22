package topmodel.toh.api.server.heroes;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import topmodel.toh.dtos.heroes.HeroCreationDto;
import topmodel.toh.dtos.heroes.HeroDto;
import topmodel.toh.dtos.heroes.HeroUpdateDto;
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

	@Override
	public HeroDto createHero(@Valid HeroCreationDto heroCreate) {
		return heroesService.createHero(heroCreate);
	}

	@Override
	public HeroDto getHero(Long herId) {
		return heroesService.getHero(herId);
	}

	@Override
	public HeroDto updateHero(Long herId, HeroUpdateDto heroUpdate) {
		return heroesService.updateHero(herId, heroUpdate);
	}

	@Override
	public void deleteHero(Long herId) {
		heroesService.deleteHero(herId);
	}

}
