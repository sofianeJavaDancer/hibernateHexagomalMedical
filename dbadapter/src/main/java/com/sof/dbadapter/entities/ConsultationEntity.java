package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="CONSULTATION")
@Setter
@Getter
@NoArgsConstructor
public class ConsultationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String rapport;

    @OneToOne
    @JoinColumn(name="meeting_id", referencedColumnName = "id")
    private RendezVousEntity meeting;


}
