package com.sof.webadapter.resources;

import com.sof.domain.Consultation;
import com.sof.domain.Medecin;
import com.sof.domain.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeetingResource {

    private Long id;
    private Medecin medecin;
    private Patient patient;
    private Consultation consultation;

    private String date;
    private String heure;
}
