package com.teste.becommerce.controllers;

import com.teste.becommerce.models.DnaModel;
import com.teste.becommerce.services.SimianService;
import com.teste.becommerce.validators.DnaValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simian")
public class SimianController {

    @Autowired
    private SimianService service;

    @PostMapping
    public ResponseEntity teste(@RequestBody DnaModel dnaModel) {

        String[] dna = dnaModel.getDna();

        if(!DnaValidate.isValid(dna)) {
            return new ResponseEntity<>("INVALID DNA",HttpStatus.BAD_REQUEST);
        }

        if(!service.isSimian(dna)) {
            return new ResponseEntity<>("NOT SIMIAN",HttpStatus.FORBIDDEN);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
