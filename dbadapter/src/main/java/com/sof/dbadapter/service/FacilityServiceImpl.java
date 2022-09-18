package com.sof.dbadapter.service;

import com.sof.business.ports.FacilityService;
import com.sof.dbadapter.entities.StructureHospitaliereEntity;
import com.sof.dbadapter.mapper.ConsultationEntityMapper;
import com.sof.dbadapter.mapper.FacilityEntityMapper;
import com.sof.dbadapter.repository.ConsultationRepository;
import com.sof.dbadapter.repository.FacilityRepository;
import com.sof.domain.Consultation;
import com.sof.domain.Facility;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class FacilityServiceImpl implements FacilityService {

    @Autowired
    private FacilityRepository facilityRepository;

    @Autowired
    private FacilityEntityMapper facilityEntityMapper;

    public Facility getById(Long id) {
        StructureHospitaliereEntity structureHospitaliereEntity = facilityRepository.findById(id).get();
        final Facility facility = facilityEntityMapper.fromAdapterToDomain(structureHospitaliereEntity);
        return facility;
    }
}
