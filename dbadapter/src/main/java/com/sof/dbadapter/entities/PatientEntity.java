package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="PATIENT")
@Setter
@Getter
@NoArgsConstructor
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String insurance;
    private String email;

    @ManyToMany(mappedBy = "patients")
    Set<MedecinEntity> medecins;

    @OneToMany(mappedBy = "patient")
    Set<RendezVousEntity> meetings;

}
