package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.PatientEntity;
import com.sof.domain.Patient;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface PatientEntityMapper {

    Patient fromAdapterToDomain(PatientEntity patientEntity);
    Set<Patient> fromAdapterToDomain(Collection<PatientEntity> patientEntities);
}
