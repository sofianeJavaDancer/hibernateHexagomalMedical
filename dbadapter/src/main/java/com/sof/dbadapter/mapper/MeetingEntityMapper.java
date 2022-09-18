package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.RendezVousEntity;
import com.sof.domain.Meeting;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MeetingEntityMapper {

    Meeting fromAdapterToDomain(RendezVousEntity meetingEntity);
    Set<Meeting> fromAdapterToDomain(Collection<RendezVousEntity> meetingEntities);
}
