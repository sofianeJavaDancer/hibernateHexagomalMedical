package com.sof.webadapter.mapper;

import com.sof.domain.Meeting;
import com.sof.webadapter.resources.MeetingResource;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MeetingResourceReverseMapper {

    Meeting fromResourceToDomain(MeetingResource meeting);

    Set<Meeting> fromResourceToDomain(Collection<MeetingResource> meetings);
}
