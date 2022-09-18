package com.sof.webadapter.controller;

import com.sof.business.ports.PatientService;
import com.sof.domain.Patient;
import com.sof.webadapter.mapper.PatientResourceMapper;
import com.sof.webadapter.resources.PatientResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientResourceMapper patientResourceMapper;

    @GetMapping("/{id}")
    public PatientResource getPatient(@PathVariable Long id) {
        Patient patient = patientService.getById(id);
        return patientResourceMapper.fromDomainToResource(patient);
    }

    @GetMapping("")
    public Set<PatientResource> getAllPatient() {
        Set<Patient> patients = patientService.getAll();
        return patientResourceMapper.fromDomainToResource(patients);
    }

}
