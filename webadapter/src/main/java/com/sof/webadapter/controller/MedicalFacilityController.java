package com.sof.webadapter.controller;

import com.sof.business.ports.MedicalFacilityService;
import com.sof.domain.MedicalFacility;
import com.sof.webadapter.mapper.MedicalFacilityResourceMapper;
import com.sof.webadapter.mapper.MedicalFacilityResourceReverseMapper;
import com.sof.webadapter.resources.MedicalFacilityResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/facilities")
public class MedicalFacilityController {

    @Autowired
    private MedicalFacilityService medicalFacilityService;

    @Autowired
    private MedicalFacilityResourceMapper medicalFacilityResourceMapper;

    @Autowired
    private MedicalFacilityResourceReverseMapper medicalFacilityResourceReverseMapper;

    @GetMapping()
    public Set<MedicalFacilityResource> getAllPatient() {
        Set<MedicalFacility> medicalFacilities = medicalFacilityService.getAll();
        return medicalFacilityResourceMapper.fromDomainToResource(medicalFacilities);
    }

    @GetMapping("/{id}")
    public MedicalFacilityResource getFacility(@PathVariable Long id) {
        MedicalFacility medicalFacility = medicalFacilityService.getById(id);
        return medicalFacilityResourceMapper.fromDomainToResource(medicalFacility);
    }

    @PostMapping("/create")
    public MedicalFacilityResource addFacility(@RequestBody MedicalFacilityResource medicalFacilityResource) {

        MedicalFacility medicalFacility = medicalFacilityResourceReverseMapper.fromResourceToDomain(medicalFacilityResource);
        MedicalFacility createdMedicalFacility = medicalFacilityService.addMedicalFacility(medicalFacility);
        return medicalFacilityResourceMapper.fromDomainToResource(medicalFacility);
    }

}
