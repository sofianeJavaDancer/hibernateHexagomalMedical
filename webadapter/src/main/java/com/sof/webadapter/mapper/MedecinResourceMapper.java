package com.sof.webadapter.mapper;

import com.sof.domain.Medecin;
import com.sof.webadapter.resources.MedecinResource;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MedecinResourceMapper {

    MedecinResource fromDomainToResource(Medecin med);

    Set<MedecinResource> fromDomainToResource(Collection<Medecin> medecins);
}
