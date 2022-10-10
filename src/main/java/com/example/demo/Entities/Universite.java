package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Universite")
public class Universite implements Serializable {


    @Id
    private int idUniv;
    @Column(name = "nomUniv", length = 30, nullable = false)
    private  String nomUniv;
}
