package cl.cafeines.web.menu.demo.controllers;

import cl.cafeines.web.menu.demo.model.Option;
import cl.cafeines.web.menu.demo.model.Product;
import cl.cafeines.web.menu.demo.services.MainService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MainController {
    @Autowired
    MainService mainService;

    @GetMapping("category/{idCategory}/products")
    public List<Product> getCategoryProducts(@PathVariable Integer idCategory){
        return mainService.getCategoryProducts(idCategory);
    }

    @GetMapping("product/{idProduct}/options")
    public List<Option> getProductOptions(@PathVariable Integer idProduct){
        return mainService.getProductOptions(idProduct);
    }
}
