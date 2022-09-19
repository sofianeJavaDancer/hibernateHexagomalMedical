package com.sof.dbadapter.service;

import com.sof.business.ports.PatientService;
import com.sof.dbadapter.entities.PatientEntity;
import com.sof.dbadapter.mapper.PatientEntityMapper;
import com.sof.dbadapter.repository.PatientRepository;
import com.sof.domain.Patient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientEntityMapper patientEntityMapper;

    @Override
    public Patient getById(Long id) {
        PatientEntity patientEntity = patientRepository.findById(id).get();
        final Patient patient = patientEntityMapper.fromAdapterToDomain(patientEntity);
        return patient;
    }

    @Override
    public Set<Patient> getAll() {
        List<PatientEntity> patientEntities = patientRepository.findAll();
        final Set<Patient> patients = patientEntityMapper.fromAdapterToDomain(patientEntities);
        return patients;
    }


}
