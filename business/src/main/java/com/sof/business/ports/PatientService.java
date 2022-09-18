package com.sof.business.ports;

import com.sof.domain.Medecin;
import com.sof.domain.Meeting;
import com.sof.domain.Patient;

import java.util.Set;

public interface PatientService {

    Patient getById(Long id);

    Set<Patient> getAll();
}
