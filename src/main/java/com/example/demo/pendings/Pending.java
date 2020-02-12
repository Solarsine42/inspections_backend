package com.example.demo.pendings;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="pending")
@Data

public class Pending {
    public Pending(){};
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int inspector_id;
    @Column
    private String special_instructions;
    @Column
    private int inspection_type;
    @Column
    private String contact_info;
    @Column
    private int address_id;
    @Column
    private int member_number;

    public int getID(){
        return id;
    }
}
