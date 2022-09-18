package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.ConsultationEntity;
import com.sof.dbadapter.entities.MedecinEntity;
import com.sof.domain.Consultation;
import com.sof.domain.Medecin;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ConsultationEntityMapper {

    Consultation fromAdapterToDomain(ConsultationEntity consultationEntity);
    Set<Consultation> fromAdapterToDomain(Collection<ConsultationEntity> consultationEntities);
}
