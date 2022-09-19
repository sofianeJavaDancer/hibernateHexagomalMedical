package com.sof.business.ports;

import com.sof.domain.Consultation;
import com.sof.domain.Facility;

import java.util.Set;

public interface FacilityService {

    Facility getById(Long id);

    Set<Facility> getAll();
}
