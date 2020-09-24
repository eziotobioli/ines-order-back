package cl.cafeines.web.menu.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

    Integer idCategory;

    String Name;

    String ImageUrl;

    String Description;

}
