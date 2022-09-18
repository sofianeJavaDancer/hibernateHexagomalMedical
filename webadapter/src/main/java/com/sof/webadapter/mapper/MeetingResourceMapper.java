package com.sof.webadapter.mapper;

import com.sof.domain.Meeting;
import com.sof.webadapter.resources.MeetingResource;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MeetingResourceMapper {

    MeetingResource fromDomainToResource(Meeting meeting);

    Set<MeetingResource> fromDomainToResource(Collection<Meeting> meetings);
}
