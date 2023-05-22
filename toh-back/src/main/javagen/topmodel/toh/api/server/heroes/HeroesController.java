////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.api.server.heroes;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import topmodel.toh.dtos.heroes.HeroCreationDto;
import topmodel.toh.dtos.heroes.HeroDto;
import topmodel.toh.dtos.heroes.HeroUpdateDto;

@RequestMapping("heroes")
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface HeroesController {


	/**
	 * Création d'un héro.
	 * @param heroUpdate Informations à modifier
	 * @return Liste des héros
	 */
	@PostMapping(path = "")
	HeroDto createHero(@RequestBody @Valid HeroCreationDto heroUpdate);

	/**
	 * Suppression d'un héro.
	 * @param herId Id technique du héro
	 */
	@DeleteMapping(path = "/{herId}")
	void deleteHero(@PathVariable("herId") Long herId);

	/**
	 * Renvoie le détail d'un héro.
	 * @param herId Id technique du héro
	 * @return Liste des héros
	 */
	@GetMapping(path = "/{herId}")
	HeroDto getHero(@PathVariable("herId") Long herId);

	/**
	 * Renvoie la liste des héros filtrés avec le terme le cas échéant.
	 * @param term Terme de la recherche
	 * @return Liste des héros
	 */
	@GetMapping(path = "")
	List<HeroDto> searchHeroes(@RequestParam(value = "term", required = false) String term);

	/**
	 * Modification d'un héro.
	 * @param herId Id technique du héro
	 * @param heroUpdate Informations à modifier
	 * @return Liste des héros
	 */
	@PatchMapping(path = "/{herId}")
	HeroDto updateHero(@PathVariable("herId") Long herId, @RequestBody @Valid HeroUpdateDto heroUpdate);
}
