package com.sof.dbadapter.service;


import com.sof.business.ports.MedecinService;
import com.sof.dbadapter.entities.MedecinEntity;
import com.sof.dbadapter.mapper.MedecinEntityMapper;
import com.sof.dbadapter.repository.MedecinRepository;
import com.sof.domain.Medecin;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Service
public class MedecinServiceImpl implements MedecinService {

    @Autowired
    private MedecinRepository medecinRepository;

    @Autowired
    private MedecinEntityMapper medecinMapper;

    @Override
    public Medecin getById(Long id) {
        var medecinEntity = medecinRepository.findById(id).get();
        final Medecin medecin = medecinMapper.fromAdapterToDomain(medecinEntity);
        return medecin;
    }

    @Override
    public Set<Medecin> getAll() {
        List<MedecinEntity> medecinEntities = medecinRepository.findAll();
        final Set<Medecin> medecins = medecinMapper.fromAdapterToDomain(medecinEntities);
        return medecins;
    }
}
