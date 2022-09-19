package com.sof.dbadapter.service;

import com.sof.business.ports.ConsultationService;
import com.sof.dbadapter.entities.ConsultationEntity;
import com.sof.dbadapter.mapper.ConsultationEntityMapper;
import com.sof.dbadapter.repository.ConsultationRepository;
import com.sof.domain.Consultation;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Service
public class ConsultationServiceImpl implements ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private ConsultationEntityMapper consultationEntityMapper;

    public Consultation getById(Long id) {
        var consultationEntity = consultationRepository.findById(id).get();
        final Consultation consultation = consultationEntityMapper.fromAdapterToDomain(consultationEntity);
        return consultation;
    }


    @Override
    public Set<Consultation> getAll() {
        List<ConsultationEntity> consultationEntities = consultationRepository.findAll();
        final Set<Consultation> consultations = consultationEntityMapper.fromAdapterToDomain(consultationEntities);
        return consultations;
    }
}
