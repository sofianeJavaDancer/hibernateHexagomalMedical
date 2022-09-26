package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.PatientEntity;
import com.sof.domain.Medecin;
import com.sof.domain.Meeting;
import com.sof.domain.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface PatientEntityMapper {

    @Mapping(target="meetings", ignore=true)
    @Mapping(target="medecins", ignore=true)
    Patient fromAdapterToDomain(PatientEntity patientEntity);
    Set<Patient> fromAdapterToDomain(Collection<PatientEntity> patientEntities);
}
