package com.sof.webadapter.mapper;

import com.sof.business.usecases.exceptions.EnumeratedBusinessErrors;
import com.sof.business.usecases.exceptions.MedicalBusinessException;
import com.sof.webadapter.resources.MedicalBusinessExceptionResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.http.HttpStatus;

import java.util.Collections;

@Mapper(componentModel = "spring")
public interface MedicalBusinessExceptionResourceMapper {

    @Mapping(target="message", expression="java(medicalBusinessException.getError().getMessage())")
    MedicalBusinessExceptionResource fromDomainToResource(MedicalBusinessException medicalBusinessException);

}
