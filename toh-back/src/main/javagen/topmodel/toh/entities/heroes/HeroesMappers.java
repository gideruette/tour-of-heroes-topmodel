////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.entities.heroes;

import topmodel.toh.dtos.heroes.HeroDto;

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
}
