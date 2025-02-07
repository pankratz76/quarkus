package io.quarkus.hibernate.reactive.context;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "context_fruits")
public class Fruit {

    @Id
    Integer id;
    String name;

}
