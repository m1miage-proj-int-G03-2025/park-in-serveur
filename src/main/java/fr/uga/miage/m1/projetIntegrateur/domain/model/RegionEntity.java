package fr.uga.miage.m1.projetIntegrateur.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "region")
public class RegionEntity {
    @Id
    @Column(name = "nom_region",length = 50)
    private String nomRegion;

    @OneToMany(mappedBy = "region")
    private List<DepartementEntity> departements;
}
