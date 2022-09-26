package com.sof.dbadapter.service;

import com.sof.business.ports.MedicalFacilityService;
import com.sof.dbadapter.entities.MedicalFacilityEntity;
import com.sof.dbadapter.mapper.MedicalFacilityEntityMapper;
import com.sof.dbadapter.mapper.MedicalFacilityEntityReverseMapper;
import com.sof.dbadapter.repository.MedicalFacilityRepository;
import com.sof.domain.MedicalFacility;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Service
public class MedicalFacilityServiceImpl implements MedicalFacilityService {

    @Autowired
    private MedicalFacilityRepository medicalFacilityRepository;

    @Autowired
    private MedicalFacilityEntityMapper medicalFacilityEntityMapper;

    @Autowired
    private MedicalFacilityEntityReverseMapper medicalFacilityEntityReverseMapper;

    public MedicalFacility getById(Long id) {
        MedicalFacilityEntity medicalFacilityEntity = medicalFacilityRepository.findById(id).get();
        final MedicalFacility facility = medicalFacilityEntityMapper.fromAdapterToDomain(medicalFacilityEntity);
        return facility;
    }


    @Override
    public Set<MedicalFacility> getAll() {
        List<MedicalFacilityEntity> facilityEntities = medicalFacilityRepository.findAll();
        final Set<MedicalFacility> facilities = medicalFacilityEntityMapper.fromAdapterToDomain(facilityEntities);
        return facilities;
    }

    @Override
    public MedicalFacility addMedicalFacility(MedicalFacility newFacility) {

        MedicalFacilityEntity medicalFacilityEntity =  medicalFacilityEntityReverseMapper.fromDomainToAdapter(newFacility);
        MedicalFacilityEntity savedMedicalFacilityEntity =  medicalFacilityRepository.save(medicalFacilityEntity);
        return medicalFacilityEntityMapper.fromAdapterToDomain(savedMedicalFacilityEntity);
    }
}
