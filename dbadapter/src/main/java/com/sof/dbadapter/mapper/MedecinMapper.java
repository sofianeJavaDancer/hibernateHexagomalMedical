package com.sof.dbadapter.mapper;


import com.sof.dbadapter.entities.MedecinEntity;
import com.sof.domain.Medecin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedecinMapper {

    MedecinEntity fromDomainToAdapter(Medecin medecin);

    Medecin fromAdapterToDomain(MedecinEntity medecinEntity);
}
