////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.entities.heroes;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Un héro.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
@Entity
@Table(name = "HERO")
public class Hero {

	/**
	 * Id technique du héro.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HER_ID", nullable = false)
	private Long id;

	/**
	 * Nom du héro.
	 */
	@Column(name = "HER_NAME", nullable = false, length = 100)
	private String name;

	/**
	 * No arg constructor.
	 */
	public Hero() {
	}

	/**
	 * Copy constructor.
	 * @param hero to copy
	 */
	public Hero(Hero hero) {
		if(hero == null) {
			return;
		}

		this.id = hero.getId();
		this.name = hero.getName();
	}

	/**
	 * All arg constructor.
	 * @param id Id technique du héro
	 * @param name Nom du héro
	 */
	public Hero(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link topmodel.toh.entities.heroes.Hero#id id}.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link topmodel.toh.entities.heroes.Hero#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the value of {@link topmodel.toh.entities.heroes.Hero#id id}.
	 * @param id value to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link topmodel.toh.entities.heroes.Hero#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
