package fr.uga.miage.m1.projetIntegrateur.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "reservation")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private Long id;

    @Column(name = "date")
    private LocalDate dateReservation;

    @Column(name = "heure_debut")
    private LocalTime heureDebut;

    @Column(name = "duree_en_heure")
    private Integer dureeEnHeure;

    @Column(name = "statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "numeroPlace")
    private PlaceEntity place;

    @ManyToOne
    @JoinColumn(name = "idConducteur")
    private UtilisateurEntity utilisateur;

}
