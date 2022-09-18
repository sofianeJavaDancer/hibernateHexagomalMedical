package com.sof.webadapter.mapper;

import com.sof.domain.Consultation;
import com.sof.webadapter.resources.ConsultationResource;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ConsultationResourceMapper {

    ConsultationResource fromDomainToResource(Consultation consultation);

    Set<ConsultationResource> fromDomainToResource(Collection<Consultation> consultations);
}
