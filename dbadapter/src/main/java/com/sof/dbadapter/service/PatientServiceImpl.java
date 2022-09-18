package com.sof.dbadapter.service;

import com.sof.business.ports.PatientService;
import com.sof.dbadapter.entities.PatientEntity;
import com.sof.dbadapter.entities.RendezVousEntity;
import com.sof.dbadapter.mapper.PatientEntityMapper;
import com.sof.dbadapter.repository.PatientRepository;
import com.sof.domain.Meeting;
import com.sof.domain.Patient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientEntityMapper patientEntityMapper;

    public Patient getById(Long id) {
        PatientEntity patientEntity = patientRepository.findById(id).get();
        final Patient patient = patientEntityMapper.fromAdapterToDomain(patientEntity);
        return patient;
    }
}
