package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Equipe")
public class Equipe implements Serializable {
    @Id
    private int idEquipe;
    @Column(name = "nomEquipe", length = 30, nullable = false)
    private  String nomEquipe;
    private  Niveau niveau;

}
