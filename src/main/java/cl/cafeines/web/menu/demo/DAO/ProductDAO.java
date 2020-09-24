package cl.cafeines.web.menu.demo.DAO;

import cl.cafeines.web.menu.demo.model.Option;
import cl.cafeines.web.menu.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Integer> {

    @Query("select P from Product P where P.idCategory=?1")
    List<Product> getCategoryProducts(Integer idCategory);

    @Query("select O from Option O where O.idProduct=?1")
    List<Option> getProductOptions(Integer idProduct);
}
