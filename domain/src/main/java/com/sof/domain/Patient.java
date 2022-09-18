package com.sof.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private long id;
    private String name;
    private String insurance;
    private String email;

    Set<Medecin> medecins;

    Set<Meeting> meetings;
}
