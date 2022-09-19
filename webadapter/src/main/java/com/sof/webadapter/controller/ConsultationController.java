package com.sof.webadapter.controller;

import com.sof.business.ports.ConsultationService;
import com.sof.domain.Consultation;
import com.sof.webadapter.mapper.ConsultationResourceMapper;
import com.sof.webadapter.resources.ConsultationResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/consultations")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @Autowired
    private ConsultationResourceMapper consultationResourceMapper;


    @GetMapping("/{id}")
    public ConsultationResource getConsultation(@PathVariable Long id) {
        Consultation consultation = consultationService.getById(id);
        return consultationResourceMapper.fromDomainToResource(consultation);
    }

    @GetMapping("")
    public Set<ConsultationResource> getAllPatient() {
        Set<Consultation> consultations = consultationService.getAll();
        return consultationResourceMapper.fromDomainToResource(consultations);
    }
}
