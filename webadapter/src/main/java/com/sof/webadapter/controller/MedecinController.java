package com.sof.webadapter.controller;

import com.sof.business.ports.MedecinService;
import com.sof.domain.Medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medecins")
public class MedecinController {
    @Autowired
    private MedecinService medecinService;

    @GetMapping("/{id}")
    public Medecin getMedecin(@PathVariable Long id) {
        return medecinService.getMedecinById(id);
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
