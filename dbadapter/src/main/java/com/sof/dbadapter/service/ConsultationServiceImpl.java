package com.sof.dbadapter.service;

import com.sof.business.ports.ConsultationService;
import com.sof.dbadapter.mapper.ConsultationEntityMapper;
import com.sof.dbadapter.mapper.MedecinEntityMapper;
import com.sof.dbadapter.repository.ConsultationRepository;
import com.sof.dbadapter.repository.MedecinRepository;
import com.sof.domain.Consultation;
import com.sof.domain.Medecin;
import com.sof.domain.Patient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
