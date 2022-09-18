package com.sof.business.ports;

import com.sof.domain.Meeting;
import com.sof.domain.Patient;

public interface PatientService {

    Patient getById(Long id);
}
