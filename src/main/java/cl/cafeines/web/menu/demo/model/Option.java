package cl.cafeines.web.menu.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Option")
@Data
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

    String Name;

    Integer idProduct;

    Integer Price;
}
