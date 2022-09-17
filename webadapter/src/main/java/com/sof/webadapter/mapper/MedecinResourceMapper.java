package com.sof.webadapter.mapper;

import com.sof.domain.Medecin;
import com.sof.webadapter.resources.MedecinResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedecinResourceMapper {

    MedecinResource fromDomainToResource(Medecin med);
}
