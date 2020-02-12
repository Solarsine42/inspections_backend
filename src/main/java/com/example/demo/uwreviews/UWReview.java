package com.example.demo.uwreviews;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="uwreviews")
@Data

public class UWReview {
    public UWReview(){};
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int member_number;
    @Column
    private int address_id;
    @Column
    private String inspection_company;
    @Column
    private boolean in_process;
    @Column
    private String request_date;
    @Column
    private String request_text;
    @Column
    private String decision_text;

    public int getID(){
        return id;
    }
}
