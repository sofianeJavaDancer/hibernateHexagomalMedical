package com.sof.dbadapter.entities;

import com.sof.domain.SpecialityEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="MEDECIN")
@Setter
@Getter
@NoArgsConstructor
public class MedecinEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private SpecialityEnum speciality;

    @ManyToMany
    @JoinTable(name = "MEDECIN_PATIENT",
    joinColumns = @JoinColumn(name="medecin_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name="patient_id", referencedColumnName = "id"))
    Set<PatientEntity> patients;

    @OneToMany(mappedBy = "medecin")
    Set<RendezVousEntity> meetings;
}
