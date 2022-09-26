package com.sof.webadapter.mapper;

import com.sof.domain.MedicalFacility;
import com.sof.webadapter.resources.MedicalFacilityResource;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MedicalFacilityResourceMapper {

    MedicalFacilityResource fromDomainToResource(MedicalFacility medicalFacility);

    Set<MedicalFacilityResource> fromDomainToResource(Collection<MedicalFacility> medicalFacilities);
}
