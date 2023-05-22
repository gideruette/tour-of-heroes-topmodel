package topmodel.toh.services.heroes;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import topmodel.toh.daos.heroes.HeroDAO;
import topmodel.toh.dtos.heroes.HeroCreationDto;
import topmodel.toh.dtos.heroes.HeroDto;
import topmodel.toh.dtos.heroes.HeroUpdateDto;

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

	/**
	 * Retourne le détail d'un héro
	 * 
	 * @param herId
	 * @return
	 */
	public HeroDto getHero(Long herId) {
		return new HeroDto(heroDAO.findById(herId).orElseThrow());
	}

	/**
	 * @param herId      Id du héro à modifier
	 * @param heroUpdate champs à modifier
	 * @return objet de consultation du héro
	 */
	public HeroDto updateHero(Long herId, HeroUpdateDto heroUpdate) {
		var hero = heroDAO.findById(herId).orElseThrow();
		heroUpdate.toHero(hero);
		var savedHero = heroDAO.save(hero);
		return new HeroDto(savedHero);
	}

	/**
	 * Création d'un héro
	 * 
	 * @param heroCreate le héro à créer
	 * @return le héro créé
	 */
	public HeroDto createHero(@Valid HeroCreationDto heroCreate) {
		var savedHero = heroDAO.save(heroCreate.toHero(null));
		return new HeroDto(savedHero);
	}

	/**
	 * 
	 * Suppression d'un héro par son id.
	 * 
	 * @param herId identifiant du héro à supprimer
	 */
	public void deleteHero(Long herId) {
		heroDAO.deleteById(herId);
	}
}
