package com.sof.webadapter.mapper;

import com.sof.domain.MedicalFacility;
import com.sof.webadapter.resources.MedicalFacilityResource;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@DecoratedWith(PolymorphiqueMedicalFacilityReverseMapper.class)
@Mapper(componentModel = "spring")
public interface MedicalFacilityResourceReverseMapper {

    MedicalFacility fromResourceToDomain(MedicalFacilityResource medicalFacilityResource);

    Set<MedicalFacility> fromResourceToDomain(Collection<MedicalFacilityResource> medicalFacilityResources);
}
