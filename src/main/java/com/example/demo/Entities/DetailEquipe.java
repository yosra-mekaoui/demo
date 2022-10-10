package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    private int idDetailEquipe;
    @Column(name = "thematique", length = 30, nullable = false)
    private  String thematique;
    private int salle;
}
