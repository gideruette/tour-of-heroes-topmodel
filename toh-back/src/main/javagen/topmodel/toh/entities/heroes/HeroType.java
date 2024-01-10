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

import tourofheroes.enums.heroes.HeroTypeCode;

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
	@Column(name = "HTY_CODE", nullable = false, length = 3, columnDefinition = "varchar")
	@Enumerated(EnumType.STRING)
	private HeroTypeCode code;

	/**
	 * Libelle du type.
	 */
	@Column(name = "HTY_LIBELLE", nullable = false, length = 100, columnDefinition = "varchar")
	private String libelle;

	/**
	 * No arg constructor.
	 */
	public HeroType() {
	}

	public static final HeroType EXT = new HeroType(HeroTypeCode.EXT);
	public static final HeroType HUM = new HeroType(HeroTypeCode.HUM);

	/**
	 * Enum constructor.
	 * @param code Code dont on veut obtenir l'instance.
	 */
	public HeroType(HeroTypeCode code) {
		this.code = code;
		switch(code) {
		case EXT :
			this.libelle = "heroes.heroType.values.SPP";
			break;
		case HUM :
			this.libelle = "heroes.heroType.values.WWO";
			break;
		}
	}

	/**
	 * Getter for code.
	 *
	 * @return value of {@link topmodel.toh.entities.heroes.HeroType#code code}.
	 */
	public HeroTypeCode getCode() {
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
	public void setCode(HeroTypeCode code) {
		this.code = code;
	}

	/**
	 * Set the value of {@link topmodel.toh.entities.heroes.HeroType#libelle libelle}.
	 * @param libelle value to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
