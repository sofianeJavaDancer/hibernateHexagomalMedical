package com.sof.dbadapter.mapper;


import com.sof.dbadapter.entities.MedecinEntity;
import com.sof.domain.Medecin;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MedecinEntityMapper {

    Medecin fromAdapterToDomain(MedecinEntity medecinEntity);
    Set<Medecin> fromAdapterToDomain(Collection<MedecinEntity> medecinEntities);
}
