package com.sof.dbadapter.mapper;

import com.sof.dbadapter.entities.MedecinEntity;
import com.sof.domain.Medecin;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface MedecinEntityReverseMapper {

    MedecinEntity fromDomainToAdapter(Medecin medecin);

    Set<MedecinEntity> fromDomainToAdapter(Collection<Medecin> medecins);
}
