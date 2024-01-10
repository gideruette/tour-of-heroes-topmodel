package topmodel.toh.api.server.heroes;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import topmodel.toh.dtos.heroes.HeroCreationDto;
import topmodel.toh.dtos.heroes.HeroDto;
import topmodel.toh.dtos.heroes.HeroUpdateDto;
import topmodel.toh.services.heroes.HeroService;

@RestController
public class HeroControllerImpl implements HeroController {

	private final HeroService heroService;

	public HeroControllerImpl(HeroService heroService) {
		this.heroService = heroService;
	}

	@Override
	public List<HeroDto> getHeroes(String term) {
		return heroService.getHeroes(term);
	}

	@Override
	public HeroDto addHero(@Valid HeroCreationDto heroCreate) {
		return heroService.addHero(heroCreate);
	}

	@Override
	public HeroDto getHero(Long herId) {
		return heroService.getHero(herId);
	}

	@Override
	public HeroDto updateHero(Long herId, HeroUpdateDto heroUpdate) {
		return heroService.updateHero(herId, heroUpdate);
	}

	@Override
	public void deleteHero(Long herId) {
		heroService.deleteHero(herId);
	}

}
