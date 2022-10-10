package com.example.demo.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    private int idEtudiant;
    @Column(name = "prenomE", length = 30, nullable = false)
    private  String prenomE;
    @Column(name = "nomE", length = 30, nullable = false)
    private  String nomE;
    private  Option option;

}
