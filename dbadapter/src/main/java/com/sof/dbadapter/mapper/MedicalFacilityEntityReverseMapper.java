package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.MedicalFacilityEntity;
import com.sof.domain.MedicalFacility;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@DecoratedWith(PolymorphiqueMedicalFacilityReverseMapper.class)
@Mapper(componentModel = "spring")
public interface MedicalFacilityEntityReverseMapper {

    MedicalFacilityEntity fromDomainToAdapter(MedicalFacility medicalFacility);

    Set<MedicalFacilityEntity> fromDomainToAdapter(Collection<MedicalFacility> medicalFacilities);
}
