package com.example.crud.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Developer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public static void main(String[] args) {
        String x = "aB";
        String y = "Ba";

        System.out.println(x.hashCode()+ "   "+ y.hashCode() );

    }

}
