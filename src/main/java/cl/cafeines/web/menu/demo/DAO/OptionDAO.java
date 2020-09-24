package cl.cafeines.web.menu.demo.DAO;

import cl.cafeines.web.menu.demo.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionDAO extends JpaRepository<Option, Integer> {
}
