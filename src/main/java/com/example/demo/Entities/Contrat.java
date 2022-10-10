package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Contrat")
public class Contrat implements Serializable {

    @Id
    private int idContrat;
    @Temporal(TemporalType.DATE)
    @Column(name = "dateFinContrat", nullable = false)
    private Date dateFinContrat;
    private boolean archive;
    private int montantContrat;
    private Specialite specialite;

}
