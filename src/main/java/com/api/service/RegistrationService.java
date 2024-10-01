package com.api.service;

import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.repositry.RegistrationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
   private RegistrationRepository registrationRepository;
   private ModelMapper modelMapper;

    public RegistrationService(RegistrationRepository registrationRepository, ModelMapper modelMapper) {
        this.registrationRepository = registrationRepository;
        this.modelMapper = modelMapper;
    }

    public RegistrationDto createRegistrationDto(RegistrationDto registrationDto) {
        Registration registration = mapToEntity(registrationDto);
        Registration saveEntity = registrationRepository.save(registration);
        RegistrationDto regDto = mapToDto(saveEntity);
        return regDto;
    }
      Registration mapToEntity(RegistrationDto registrationDto){
          Registration registration = modelMapper.map(registrationDto, Registration.class);
           return registration;
      }
     RegistrationDto  mapToDto(Registration registration){
         RegistrationDto regDto = modelMapper.map(registration, RegistrationDto.class);
         return regDto;

     }

}
