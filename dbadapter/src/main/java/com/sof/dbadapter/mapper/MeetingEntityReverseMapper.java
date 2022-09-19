package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.RendezVousEntity;
import com.sof.domain.Meeting;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MeetingEntityReverseMapper {

    RendezVousEntity fromDomainToAdapter(Meeting meeting);

    Set<RendezVousEntity> fromDomainToAdapter(Collection<Meeting> meetings);
}
