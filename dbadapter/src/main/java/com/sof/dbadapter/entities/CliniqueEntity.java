package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name="CLINIQUE")
@DiscriminatorValue("CLI")
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
public class CliniqueEntity extends MedicalFacilityEntity {

    private double rate;


}
