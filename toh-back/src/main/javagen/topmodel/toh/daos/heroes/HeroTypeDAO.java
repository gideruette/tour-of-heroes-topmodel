////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.daos.heroes;

import org.springframework.data.jpa.repository.JpaRepository;

import topmodel.toh.entities.heroes.HeroType;


public interface HeroTypeDAO extends JpaRepository<HeroType, HeroType.Values> {

}
