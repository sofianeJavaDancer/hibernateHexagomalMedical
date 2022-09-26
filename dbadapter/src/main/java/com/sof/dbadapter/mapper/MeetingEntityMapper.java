package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.RendezVousEntity;
import com.sof.domain.Meeting;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring", uses = {PatientEntityMapper.class, ConsultationEntityMapper.class})
public interface MeetingEntityMapper {

    Meeting fromAdapterToDomain(RendezVousEntity meetingEntity);

    Set<Meeting> fromAdapterToDomain(Collection<RendezVousEntity> meetingEntities);
}
