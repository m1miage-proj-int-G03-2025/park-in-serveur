package fr.uga.miage.m1.projetIntegrateur.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "place")
public class PlaceEntity {
    @Id
    @Column(name = "numero_place",length = 50)
    private String numeroPlace;

    @Column(name = "est_occupee",length = 50)
    private Boolean estOccupee;

    @ManyToOne
    @JoinColumn(name = "idParking")
    private ParkingEntity parking;

    @OneToMany(mappedBy = "place")
    private List<ReservationEntity> reservations;
}
