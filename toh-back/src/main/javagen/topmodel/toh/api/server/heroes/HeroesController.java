////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.api.server.heroes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.Generated;

import topmodel.toh.dtos.heroes.HeroDto;

@RequestMapping("heroes")
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface HeroesController {


	/**
	 * Renvoie la liste des héros filtrés avec le terme le cas échéant.
	 * @param term Terme de la recherche
	 * @return Liste des héros
	 */
	@GetMapping(path = "")
	List<HeroDto> searchHeroes(@RequestParam(value = "term", required = false) String term);
}
