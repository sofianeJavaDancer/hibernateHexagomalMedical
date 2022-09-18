package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="HOSPITAL")
@DiscriminatorValue("HOSP")
@Setter
@Getter
@NoArgsConstructor
public class HospitalEntity extends StructureHospitaliereEntity {

    private int capacity;
}
