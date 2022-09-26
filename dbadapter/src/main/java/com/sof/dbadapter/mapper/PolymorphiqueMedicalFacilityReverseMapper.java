package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.CliniqueEntity;
import com.sof.dbadapter.entities.HospitalEntity;
import com.sof.dbadapter.entities.MedicalFacilityEntity;
import com.sof.domain.Clinique;
import com.sof.domain.Hospital;
import com.sof.domain.MedicalFacility;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class PolymorphiqueMedicalFacilityReverseMapper implements MedicalFacilityEntityReverseMapper {

    MedicalFacilityEntityReverseMapper medicalFacilityEntityReverseMapper;

    @Override
    public MedicalFacilityEntity fromDomainToAdapter(MedicalFacility medicalFacility) {
        MedicalFacilityEntity medicalFacilityEntity = null;

        if (medicalFacility != null) {
            if (medicalFacility instanceof Clinique) {
                medicalFacilityEntity = CliniqueEntity.builder()
                            .id(medicalFacility.getId())
                            .adresse(medicalFacility.getAdresse())
                            .rate(((Clinique) medicalFacility).getRate())
                            .build();
            } else if (medicalFacility instanceof Hospital) {
                medicalFacilityEntity = HospitalEntity.builder()
                        .id(medicalFacility.getId())
                        .adresse(medicalFacility.getAdresse())
                        .capacity(((Hospital) medicalFacility).getCapacity())
                        .build();
            } else {
                medicalFacilityEntity = medicalFacilityEntityReverseMapper.fromDomainToAdapter(medicalFacility);
            }
        }
        return medicalFacilityEntity;
    }

    @Override
    public Set<MedicalFacilityEntity> fromDomainToAdapter(Collection<MedicalFacility> medicalFacilitys) {
        return medicalFacilitys.stream().map(this::fromDomainToAdapter).collect(Collectors.toSet());
    }
}
