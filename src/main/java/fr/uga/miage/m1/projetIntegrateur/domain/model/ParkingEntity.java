package fr.uga.miage.m1.projetIntegrateur.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "parking")
public class ParkingEntity {
    @Id
    @Column(name = "id_parking",length = 50)
    private String idParking;

    @Column(name = "nom",length = 50)
    private String nom;

    @Column(name = "adresse",length = 50)
    private String adresse;

    @Column(name = "url_site_web",length = 50)
    private String urlSiteWeb;

    @Column(name = "est_gratuit")
    private Boolean estGratuit;

    @Column(name = "hauteur_max")
    private Long hauteurMax;

    @Column(name = "x_longitude")
    private double xLongitude;

    @Column(name = "y_latitude")
    private double yLatitude;

    @Column(name = "id_local",length = 50)
    private String idLocal;

    @Column(name = "tarif_pmr")
    private Long tarifPmr;

    @Column(name = "tarif_1h")
    private Long tarif1h;

    @Column(name = "tarif_2h")
    private Long tarif2h;

    @Column(name = "tarif_3h")
    private Long tarif3h;

    @Column(name = "tarif_4h")
    private Long tarif4h;

    @Column(name = "tarif_24h")
    private Long tarif24h;

    @Column(name = "tarif_abo_resident")
    private Long aboResident;

    @Column(name = "tarif_abo_non_resident")
    private Long aboNonResident;

    @Column(name = "nombre_places")
    private int nombrePlaces;

    @Column(name = "nombre_places_pr")
    private int nombrePlacesPR;

    @Column(name = "nombre_places_pmr")
    private int nombrePlacesPMR;

    @Column(name = "nombre_places_voitures_electriques")
    private int nombrePlacesVoituresElectriques;

    @Column(name = "nombre_places_velo")
    private int nombrePlacesVelo;

    @Column(name = "nombre_places_2r_el")
    private int nombrePlaces2rEL;

    @Column(name = "nombre_places_auto_partage")
    private int nombrePlacesAutoPartage;

    @Column(name = "nombre_places_2_roues_motrices")
    private int nombrePlaces2RouesMotrices;

    @Column(name = "nombre_places_covoiturage")
    private int nombrePlacesCovoiturage;

    @ManyToOne
    @JoinColumn(name = "insee_ville")
    private VilleEntity ville;

    @OneToMany(mappedBy = "parking")
    private List<PlaceEntity> places;
}
