////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.dtos.heroes;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import topmodel.toh.entities.heroes.Hero;
import topmodel.toh.entities.heroes.HeroesMappers;

/**
 * Objet de modification pour un héro.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class HeroUpdateDto implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Nom du héro.
	 * Alias of {@link topmodel.toh.entities.heroes.Hero#getName() Hero#getName()} 
	 */
	@NotNull
	private String name;

	/**
	 * No arg constructor.
	 */
	public HeroUpdateDto() {
	}

	/**
	 * Copy constructor.
	 * @param heroUpdateDto to copy
	 */
	public HeroUpdateDto(HeroUpdateDto heroUpdateDto) {
		if(heroUpdateDto == null) {
			return;
		}

		this.name = heroUpdateDto.getName();
	}

	/**
	 * All arg constructor.
	 * @param name Nom du héro
	 */
	public HeroUpdateDto(String name) {
		this.name = name;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link topmodel.toh.dtos.heroes.HeroUpdateDto#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the value of {@link topmodel.toh.dtos.heroes.HeroUpdateDto#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Mappe 'HeroUpdateDto' vers 'Hero'.
	 * @param target Instance pré-existante de 'Hero'. Une nouvelle instance sera créée si non spécifié.
	 *
	 * @return Une instance de 'Hero'.
	 */
	public Hero toHero(Hero target) {
		return HeroesMappers.toHero(this, target);
	}
}
