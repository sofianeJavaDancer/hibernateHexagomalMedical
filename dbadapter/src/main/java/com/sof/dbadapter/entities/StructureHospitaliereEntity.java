package com.sof.dbadapter.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name="FACILITY")
@Setter
@Getter
@NoArgsConstructor
public class StructureHospitaliereEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
}
