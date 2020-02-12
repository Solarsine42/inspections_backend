package com.example.demo.archived;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="archived")
@Data

public class Archive {
    public Archive(){};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String document;
    @Column
    private String inspection_date;
    @Column
    private int member_number;
    @Column
    private int address_id;

    public int getID(){
        return id;
    }
}
