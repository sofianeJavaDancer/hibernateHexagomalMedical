package com.sof.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Meeting {

    private Long id;
    private Medecin medecin;
    private Patient patient;
    private Consultation consultation;

    private LocalDate date;
    private LocalTime heure;

}
