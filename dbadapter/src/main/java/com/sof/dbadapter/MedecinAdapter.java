package com.sof.dbadapter;


import com.sof.domain.Medecin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedecinAdapter {

    MedecinEntity fromDomainToAdapter(Medecin medecin);

    Medecin fromAdapterToDomain(MedecinEntity medecinEntity);
}
