package com.sof.business.ports;


import com.sof.domain.Consultation;
import com.sof.domain.Medecin;
import com.sof.domain.Patient;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public interface MedecinService {

    Medecin getById(Long id);

    Set<Medecin> getAll();

    boolean checkMedecinAvailable(Medecin medecin, LocalDate date, LocalTime time);
    boolean checkPatientOfMedecin(Medecin medecin, Patient patient);
}
