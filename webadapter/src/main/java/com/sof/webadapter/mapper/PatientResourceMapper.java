package com.sof.webadapter.mapper;

import com.sof.domain.Patient;
import com.sof.webadapter.resources.PatientResource;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface PatientResourceMapper {

    PatientResource fromDomainToResource(Patient patient);

    Set<PatientResource> fromDomainToResource(Collection<Patient> patients);
}
