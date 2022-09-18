package com.sof.business.ports;

import com.sof.domain.Consultation;
import com.sof.domain.Facility;

public interface FacilityService {

    Facility getById(Long id);
}
