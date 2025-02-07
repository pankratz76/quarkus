package io.quarkus.spring.data.deployment.multiple_pu.second;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SecondEntity {

    @Id
    @GeneratedValue
    public Long id;

    public String name;

    @OneToOne(cascade = CascadeType.ALL)
    public SecondEntity child;
}
