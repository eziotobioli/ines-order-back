package cl.cafeines.web.menu.demo.DAO;

import cl.cafeines.web.menu.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
