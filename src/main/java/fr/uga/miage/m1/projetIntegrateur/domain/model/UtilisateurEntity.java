package fr.uga.miage.m1.projetIntegrateur.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "utilisateur")
public class UtilisateurEntity {
    @Id
    @Column(name = "id_conducteur")
    private String idConducteur;

    @Column(name = "nom_conducteur")
    private String nom;

    @Column(name = "prenom_conducteur")
    private String prenom;

    @OneToMany(mappedBy = "utilisateur")
    private List<ReservationEntity> reservations;
}
