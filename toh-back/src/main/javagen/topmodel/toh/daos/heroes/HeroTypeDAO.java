////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.daos.heroes;

import org.springframework.data.repository.CrudRepository;

import topmodel.toh.entities.heroes.HeroType;

import tourofheroes.enums.heroes.HeroTypeCode;


public interface HeroTypeDAO extends CrudRepository<HeroType, HeroTypeCode> {

}
