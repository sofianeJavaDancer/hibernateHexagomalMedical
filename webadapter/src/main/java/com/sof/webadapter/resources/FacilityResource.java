package com.sof.webadapter.resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FacilityResource {

    private long id;
    private int capacity;
    private double rate;
}
