package com.example.demo.addresses;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="addresses")
@Data

public class Address {
    public Address(){};
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String street_info;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private int zipcode;
}
