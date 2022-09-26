package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name="HOSPITAL")
@DiscriminatorValue("HOSP")
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
public class HospitalEntity extends MedicalFacilityEntity {

    private int capacity;
}
