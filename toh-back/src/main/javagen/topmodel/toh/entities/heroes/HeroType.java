////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.entities.heroes;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Un héro.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
@Entity
@Table(name = "HERO_TYPE")
@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class HeroType {

	/**
	 * Code du type de héro.
	 */
	@Id
	@Column(name = "HTY_CODE", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	private HeroType.Values code;

	/**
	 * Libelle du type.
	 */
	@Column(name = "HTY_LIBELLE", nullable = false, length = 100)
	private String libelle;

	/**
	 * No arg constructor.
	 */
	public HeroType() {
	}

	/**
	 * Copy constructor.
	 * @param heroType to copy
	 */
	public HeroType(HeroType heroType) {
		if(heroType == null) {
			return;
		}

		this.code = heroType.getCode();
		this.libelle = heroType.getLibelle();
	}

	/**
	 * All arg constructor.
	 * @param code Code du type de héro
	 * @param libelle Libelle du type
	 */
	public HeroType(HeroType.Values code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	/**
	 * Getter for code.
	 *
	 * @return value of {@link topmodel.toh.entities.heroes.HeroType#code code}.
	 */
	public HeroType.Values getCode() {
		return this.code;
	}

	/**
	 * Getter for libelle.
	 *
	 * @return value of {@link topmodel.toh.entities.heroes.HeroType#libelle libelle}.
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * Set the value of {@link topmodel.toh.entities.heroes.HeroType#code code}.
	 * @param code value to set
	 */
	public void setCode(HeroType.Values code) {
		this.code = code;
	}

	/**
	 * Set the value of {@link topmodel.toh.entities.heroes.HeroType#libelle libelle}.
	 * @param libelle value to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public enum Values {
		EXT("heroes.heroType.values.SPP"), //
		HUM("heroes.heroType.values.WWO"); 

		/**
		 * Libelle du type.
		 */
		private final String libelle;

		/**
		 * All arg constructor.
		 */
		private Values(String libelle) {
			this.libelle = libelle;
		}

		/**
		 * Méthode permettant de récupérer l'entité correspondant au code.
		 *
		 * @return instance de {@link topmodel.toh.entities.heroes.HeroType} correspondant au code courant.
		 */
		public HeroType getEntity() {
			return new HeroType(this, libelle);
		}

		/**
		 * Libelle du type.
		 */
		public String getLibelle(){
			return this.libelle;
		}
	}
}
