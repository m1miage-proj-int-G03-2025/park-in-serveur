package fr.uga.miage.m1.projetIntegrateur.domain.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "departement")
public class DepartementEntity {
    @Id
    @Column(name = "numero_departement")
    private int numeroDepartement;

    @Column(name = "nom_departement",length = 50)
    private String nom;

    @ManyToOne
    @JoinColumn(name = "nomRegion")
    private RegionEntity region;

    @OneToMany(mappedBy = "departement")
    private List<VilleEntity> villes;

}