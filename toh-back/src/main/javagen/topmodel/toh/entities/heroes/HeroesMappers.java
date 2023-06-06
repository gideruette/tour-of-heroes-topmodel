////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.entities.heroes;

import jakarta.annotation.Generated;

import topmodel.toh.dtos.heroes.HeroCreationDto;
import topmodel.toh.dtos.heroes.HeroDto;
import topmodel.toh.dtos.heroes.HeroUpdateDto;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class HeroesMappers {

	/**
	 * Map les champs des classes passées en paramètre dans l'objet target'.
	 * @param target Instance de 'HeroDto' (ou null pour créer une nouvelle instance).
	 * @param hero Instance de 'Hero'.
	 *
	 * @return Une nouvelle instance de 'HeroDto' ou bien l'instance passée en paramètres sur lesquels les champs sources ont été mappée.
	 */
	public static HeroDto createHeroDto(Hero hero, HeroDto target) {
		if (target == null) {
			target = new HeroDto();
		}

		if (hero != null) {
			target.setId(hero.getId());
			target.setName(hero.getName());
		} else {
			throw new IllegalArgumentException("hero cannot be null");
		}
		return target;
	}

	/**
	 * Mappe 'HeroCreationDto' vers 'Hero'.
	 * @param source Instance de 'HeroCreationDto'.
	 * @param target Instance pré-existante de 'Hero'. Une nouvelle instance sera créée si non spécifié.
	 *
	 * @return Une nouvelle instance de 'Hero' ou bien l'instance passée en paramètre dont les champs ont été surchargés.
	 */
	public static Hero toHero(HeroCreationDto source, Hero target) {
		if (source == null) {
			throw new IllegalArgumentException("source cannot be null");
		}

		if (target == null) {
			target = new Hero();
		}

		target.setName(source.getName());
		return target;
	}

	/**
	 * Mappe 'HeroUpdateDto' vers 'Hero'.
	 * @param source Instance de 'HeroUpdateDto'.
	 * @param target Instance pré-existante de 'Hero'. Une nouvelle instance sera créée si non spécifié.
	 *
	 * @return Une nouvelle instance de 'Hero' ou bien l'instance passée en paramètre dont les champs ont été surchargés.
	 */
	public static Hero toHero(HeroUpdateDto source, Hero target) {
		if (source == null) {
			throw new IllegalArgumentException("source cannot be null");
		}

		if (target == null) {
			target = new Hero();
		}

		target.setName(source.getName());
		return target;
	}
}
