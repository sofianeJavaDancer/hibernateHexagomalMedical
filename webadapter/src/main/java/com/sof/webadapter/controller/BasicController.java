package com.sof.webadapter.controller;

import com.sof.dbadapter.MedecinServiceImpl;
import com.sof.domain.Medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basics")
public class BasicController {
    @Autowired
    private MedecinServiceImpl basicService;

    @GetMapping("")
    public Medecin findAll() {
        return basicService.getMedecinById(1l);
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
