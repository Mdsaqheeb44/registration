package com.api.controller;

import com.api.payload.RegistrationDto;
import com.api.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public ResponseEntity<RegistrationDto> createRegistration( @RequestBody RegistrationDto registrationDto){
        RegistrationDto reg = registrationService.createRegistrationDto(registrationDto);
        return new ResponseEntity<>(reg, HttpStatus.CREATED);
    }

    public void test(){
        System.out.println("Hello");
    }
}
