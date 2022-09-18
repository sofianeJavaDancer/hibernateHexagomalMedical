package com.sof.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Meeting {

    private Long id;
    private Medecin medecin;
    private Patient patient;
    private Consultation consultation;

    private LocalDate date;
    private LocalTime heure;

}
