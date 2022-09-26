package com.sof.webadapter.resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MedicalFacilityResource {

    private long id;
    private String adresse;
    private double rate;
    private int capacity;
    private String type;
}
