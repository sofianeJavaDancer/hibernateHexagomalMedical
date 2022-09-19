package com.sof.webadapter.controller;

import com.sof.business.ports.FacilityService;
import com.sof.domain.Facility;
import com.sof.webadapter.mapper.FacilityResourceMapper;
import com.sof.webadapter.resources.FacilityResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/facilities")
public class FacilityController {

    @Autowired
    private FacilityService facilityService;

    @Autowired
    private FacilityResourceMapper facilityResourceMapper;


    @GetMapping("/{id}")
    public FacilityResource getFacility(@PathVariable Long id) {
        Facility consultation = facilityService.getById(id);
        return facilityResourceMapper.fromDomainToResource(consultation);
    }

    @GetMapping("")
    public Set<FacilityResource> getAllPatient() {
        Set<Facility> consultations = facilityService.getAll();
        return facilityResourceMapper.fromDomainToResource(consultations);
    }

}
