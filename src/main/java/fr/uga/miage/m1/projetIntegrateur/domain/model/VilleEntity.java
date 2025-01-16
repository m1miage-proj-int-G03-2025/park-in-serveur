package fr.uga.miage.m1.projetIntegrateur.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "ville")
public class VilleEntity {
    @Id
    @Column(name = "insee_ville")
    private int inseeVille;

    @Column(name = "code_postal")
    private int codePostal;

    @Column(name = "nom",length = 50)
    private String nom;

    @Column(name = "y_latitude")
    private double yLatitude;

    @Column(name = "x_longitude")
    private double xLongitude;

    @Column(name = "nom_departement")
    private String nomDepartement;

    @OneToMany(mappedBy = "ville")
    private List<ParkingEntity> parkings;
}
