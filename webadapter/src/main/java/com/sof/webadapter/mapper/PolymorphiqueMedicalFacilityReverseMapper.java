package com.sof.webadapter.mapper;

import com.sof.domain.Clinique;
import com.sof.domain.Hospital;
import com.sof.domain.MedicalFacility;
import com.sof.webadapter.resources.MedicalFacilityResource;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;


public class PolymorphiqueMedicalFacilityReverseMapper implements MedicalFacilityResourceReverseMapper {


    MedicalFacilityResourceReverseMapper medicalFacilityResourceReverseMapper;

    @Override
    public MedicalFacility fromResourceToDomain(MedicalFacilityResource medicalFacilityResource) {
        MedicalFacility medicalFacility = null;
        if (medicalFacilityResource != null) {
            switch (medicalFacilityResource.getType()) {
                case "CLINIQUE":
                    medicalFacility = Clinique.builder()
                            .id(medicalFacilityResource.getId())
                            .adresse(medicalFacilityResource.getAdresse())
                            .rate(100.0)
                            .build();
                    break;

                case "HOSPITAL":
                    medicalFacility = Hospital.builder()
                            .id(medicalFacilityResource.getId())
                            .adresse(medicalFacilityResource.getAdresse())
                            .capacity(medicalFacilityResource.getCapacity())
                            .build();
                    break;

                default:
                    medicalFacility = medicalFacilityResourceReverseMapper.fromResourceToDomain(medicalFacilityResource);
            }
        }
        return medicalFacility;
    }

    @Override
    public Set<MedicalFacility> fromResourceToDomain(Collection<MedicalFacilityResource> medicalFacilityResources) {
        return medicalFacilityResources.stream().map(this::fromResourceToDomain).collect(Collectors.toSet());
    }



}
