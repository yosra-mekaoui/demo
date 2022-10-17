package com.example.demo.Repository;
import com.example.demo.Entities.Etudiant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEtudiantRepo extends CrudRepository<Etudiant , Integer> {
    List<Etudiant> findByNomENotNull();




    void rechercheAvances(String nome);

    @Query("select e from Etudiant e where e.nomE = ?1")
    List<Etudiant> findByNomE(String nomE);

}
