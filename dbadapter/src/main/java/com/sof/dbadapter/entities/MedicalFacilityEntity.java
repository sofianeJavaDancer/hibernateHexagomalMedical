package com.sof.dbadapter.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "DTYPE")
@Table(name="MEDICAL_FACILITY")
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
public class MedicalFacilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String adresse;
}
