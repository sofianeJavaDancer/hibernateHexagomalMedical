package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.ConsultationEntity;
import com.sof.dbadapter.entities.StructureHospitaliereEntity;
import com.sof.domain.Consultation;
import com.sof.domain.Facility;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface FacilityEntityMapper {

    Facility fromAdapterToDomain(StructureHospitaliereEntity facilityEntity);
    Set<Facility> fromAdapterToDomain(Collection<StructureHospitaliereEntity> facilityEntities);
}
