package com.sof.business.ports;


import com.sof.domain.Consultation;
import com.sof.domain.Medecin;

public interface MedecinService {

    Medecin getById(Long id);
}
