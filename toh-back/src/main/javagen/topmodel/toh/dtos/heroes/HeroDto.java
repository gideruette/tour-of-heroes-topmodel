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
 * Objet de transfert pour la classe héro.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class HeroDto implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Id technique du héro.
	 * Alias of {@link topmodel.toh.entities.heroes.Hero#getId() Hero#getId()} 
	 */
	private Long id;

	/**
	 * Nom du héro.
	 * Alias of {@link topmodel.toh.entities.heroes.Hero#getName() Hero#getName()} 
	 */
	@NotNull
	private String name;

	/**
	 * No arg constructor.
	 */
	public HeroDto() {
	}

	/**
	 * Crée une nouvelle instance de 'HeroDto'.
	 * @param hero Instance de 'Hero'.
	 *
	 * @return Une nouvelle instance de 'HeroDto'.
	 */
	public HeroDto(Hero hero) {
		HeroesMappers.createHeroDto(hero, this);
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link topmodel.toh.dtos.heroes.HeroDto#id id}.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link topmodel.toh.dtos.heroes.HeroDto#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the value of {@link topmodel.toh.dtos.heroes.HeroDto#id id}.
	 * @param id value to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link topmodel.toh.dtos.heroes.HeroDto#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
