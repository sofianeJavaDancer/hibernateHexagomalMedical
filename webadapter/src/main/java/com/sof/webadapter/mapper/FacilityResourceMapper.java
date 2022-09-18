package com.sof.webadapter.mapper;

import com.sof.domain.Facility;
import com.sof.webadapter.resources.FacilityResource;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface FacilityResourceMapper {

    FacilityResource fromDomainToResource(Facility facility);

    Set<FacilityResource> fromDomainToResource(Collection<Facility> facilities);
}
