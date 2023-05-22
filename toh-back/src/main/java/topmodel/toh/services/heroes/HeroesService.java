package topmodel.toh.services.heroes;

import java.util.List;

import org.springframework.stereotype.Service;

import topmodel.toh.daos.heroes.HeroDAO;
import topmodel.toh.dtos.heroes.HeroDto;

@Service
public class HeroesService {

	private final HeroDAO heroDAO;

	public HeroesService(HeroDAO heroDAO) {
		this.heroDAO = heroDAO;
	}

	/**
	 * @return La liste de tous les héros
	 */
	public List<HeroDto> searchHeroes(String term) {
		if (term == null) {
			term = "";
		}

		term = "%" + term + "%";
		return heroDAO.findByNameIgnoreCaseLike(term).stream().map(HeroDto::new).toList();
	}
}
