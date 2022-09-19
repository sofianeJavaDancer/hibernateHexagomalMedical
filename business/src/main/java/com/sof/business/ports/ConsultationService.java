package com.sof.business.ports;

import com.sof.domain.Consultation;
import com.sof.domain.Medecin;

import java.util.Set;

public interface ConsultationService {

    Consultation getById(Long id);

    Set<Consultation> getAll();
}
