package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name="MEETING")
@Setter
@Getter
@NoArgsConstructor
public class RendezVousEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="medecin_id", referencedColumnName = "id")
    private MedecinEntity medecin;

    @ManyToOne
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    private PatientEntity patient;

    @OneToOne(mappedBy = "meeting")
    private ConsultationEntity consultation;

    private LocalDate date;
    private LocalTime heure;
}
