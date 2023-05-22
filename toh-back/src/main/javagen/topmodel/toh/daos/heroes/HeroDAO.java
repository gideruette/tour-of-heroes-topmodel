////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package topmodel.toh.daos.heroes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import topmodel.toh.entities.heroes.Hero;

public interface HeroDAO extends JpaRepository<Hero, Long> {
	List<Hero> findByNameIgnoreCaseLike(String term);
}
