package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.MedecinEntity;
import com.sof.domain.Medecin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedecinEntityReverseMapper {

    MedecinEntity fromDomainToAdapter(Medecin medecin);
}
