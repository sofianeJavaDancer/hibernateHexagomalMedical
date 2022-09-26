package com.sof.business.ports;

import com.sof.domain.MedicalFacility;

import java.util.Set;

public interface MedicalFacilityService {

    MedicalFacility getById(Long id);

    Set<MedicalFacility> getAll();

    MedicalFacility addMedicalFacility(MedicalFacility newFacility);
}
