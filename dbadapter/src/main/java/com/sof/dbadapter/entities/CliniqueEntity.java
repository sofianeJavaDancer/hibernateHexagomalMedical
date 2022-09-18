package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="CLINIQUE")
@DiscriminatorValue("CLI")
@Setter
@Getter
@NoArgsConstructor
public class CliniqueEntity extends StructureHospitaliereEntity {

    private double tarif;


}
