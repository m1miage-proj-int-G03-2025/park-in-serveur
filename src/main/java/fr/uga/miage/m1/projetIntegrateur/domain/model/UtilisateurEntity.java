package fr.uga.miage.m1.projetIntegrateur.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "utilisateur")
public class UtilisateurEntity {
    @Id
    @Column(name = "id_utilisateur")
    private String idConducteur;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "utilisateur")
    private List<ReservationEntity> reservations;
}
