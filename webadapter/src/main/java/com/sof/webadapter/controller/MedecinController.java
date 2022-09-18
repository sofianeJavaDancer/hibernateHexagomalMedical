package com.sof.webadapter.controller;

import com.sof.business.ports.MedecinService;
import com.sof.domain.Medecin;
import com.sof.webadapter.mapper.MedecinResourceMapper;
import com.sof.webadapter.resources.MedecinResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/medecins")
public class MedecinController {
    @Autowired
    private MedecinService medecinService;

    @Autowired
    private MedecinResourceMapper medecinResourceMapper;

    @GetMapping("/{id}")
    public MedecinResource getMedecin(@PathVariable Long id) {
        Medecin medecin = medecinService.getById(id);
        return medecinResourceMapper.fromDomainToResource(medecin);
    }

    @GetMapping("")
    public Set<MedecinResource> getAllMedecin() {
        Set<Medecin> medecins = medecinService.getAll();
        return medecinResourceMapper.fromDomainToResource(medecins);
    }

//    @GetMapping("/{id}")
//    public Basic findById(@PathVariable int id) {
//        Optional<Basic> basic = basicService.findById(id);
//        if (basic.isEmpty()) {
//            return null;
//        }
//        return basic.get();
//    }
//
//    @PostMapping("")
//    public Basic save(@RequestBody Basic theBasic) {
//        return basicService.save(theBasic);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable int id) {
//        basicService.deleteById(id);
//    }
}
