package com.example.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Contrat")

public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    @Temporal(TemporalType.DATE)
    @Column(name = "dateFinContrat", nullable = false)


    private Date dateFinContrat;
    private boolean archive;
    private int montantContrat;
    @Enumerated(EnumType.ORDINAL)
    private Specialite specialite;
@ManyToOne
    Etudiant etudiant;


}
