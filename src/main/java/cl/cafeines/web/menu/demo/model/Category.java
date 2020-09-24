package cl.cafeines.web.menu.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

    String Name;
}
