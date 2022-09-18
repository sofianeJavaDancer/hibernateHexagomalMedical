package com.sof.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facility {

    private long id;
    private int capacity;
    private double rate;
}
