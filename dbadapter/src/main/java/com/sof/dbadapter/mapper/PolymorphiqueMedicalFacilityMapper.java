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

public class PolymorphiqueMedicalFacilityMapper implements MedicalFacilityEntityMapper {

    MedicalFacilityEntityMapper medicalFacilityEntityMapper;
    @Override
    public MedicalFacility fromAdapterToDomain(MedicalFacilityEntity medicalFacilityEntity) {
        MedicalFacility medicalFacility = null;

        if (medicalFacilityEntity != null) {
            if (medicalFacilityEntity instanceof CliniqueEntity) {
                medicalFacility = Clinique.builder()
                        .id(medicalFacilityEntity.getId())
                        .adresse(medicalFacilityEntity.getAdresse())
                        .rate(((CliniqueEntity) medicalFacilityEntity).getRate())
                        .build();
            } else if (medicalFacilityEntity instanceof HospitalEntity) {
                medicalFacility = Hospital.builder()
                        .id(medicalFacilityEntity.getId())
                        .adresse(medicalFacilityEntity.getAdresse())
                        .capacity(((HospitalEntity) medicalFacilityEntity).getCapacity())
                        .build();
            } else {
                medicalFacility = medicalFacilityEntityMapper.fromAdapterToDomain(medicalFacilityEntity);
            }
        }
        return medicalFacility;
    }

    @Override
    public Set<MedicalFacility> fromAdapterToDomain(Collection<MedicalFacilityEntity> medicalFacilityEntityEntities) {
        return medicalFacilityEntityEntities.stream().map(this::fromAdapterToDomain).collect(Collectors.toSet());
    }
}
