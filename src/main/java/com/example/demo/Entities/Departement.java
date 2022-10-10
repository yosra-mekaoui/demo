package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Departement")
public class Departement implements Serializable {

    @Id
    private int idDepart;
    @Column(name = "nomDepart", length = 30, nullable = false)
    private  String nomDepart;
}
