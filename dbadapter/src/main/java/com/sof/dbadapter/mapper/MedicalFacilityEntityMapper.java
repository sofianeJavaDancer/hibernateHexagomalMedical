package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.MedicalFacilityEntity;
import com.sof.domain.MedicalFacility;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@DecoratedWith(PolymorphiqueMedicalFacilityMapper.class)
@Mapper(componentModel = "spring")
public interface MedicalFacilityEntityMapper {

    MedicalFacility fromAdapterToDomain(MedicalFacilityEntity medicalFacilityEntity);

    Set<MedicalFacility> fromAdapterToDomain(Collection<MedicalFacilityEntity> medicalFacilityEntities);
}
