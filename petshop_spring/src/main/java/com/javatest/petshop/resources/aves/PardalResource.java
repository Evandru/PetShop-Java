package com.javatest.petshop.resources.aves;

import com.javatest.petshop.entities.classes.ave.especies.Pardal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pardal")
public class PardalResource {
    @GetMapping
    public ResponseEntity<Pardal> findAll(){
        Pardal p = new Pardal(1L, "name", 1, 1.1, 1.1, true, "color");
        return ResponseEntity.ok().body(p);
    }
}
