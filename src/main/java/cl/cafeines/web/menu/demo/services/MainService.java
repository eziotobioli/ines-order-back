package cl.cafeines.web.menu.demo.services;

import cl.cafeines.web.menu.demo.DAO.ProductDAO;
import cl.cafeines.web.menu.demo.model.Option;
import cl.cafeines.web.menu.demo.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MainService {

    ProductDAO productDAO;

    public List<Product> getCategoryProducts(Integer idCategory) {
        return productDAO.getCategoryProducts(idCategory);
    }

    public List<Option> getProductOptions(Integer idProduct) {
        return productDAO.getProductOptions(idProduct);
    }
}
