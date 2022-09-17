package com.sof.dbadapter.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="MEDECIN")
@Setter
@Getter
@NoArgsConstructor
public class MedecinEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String name;
}
