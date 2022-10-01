package com.sof.webadapter.mapper;

import com.sof.business.usecases.exceptions.MedicalBusinessException;
import com.sof.webadapter.resources.MedicalBusinessExceptionResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicalBusinessErrorResourceMapper {

    public MedicalBusinessExceptionResource fromDomainToResource(MedicalBusinessException medicalBusinessException);

    default MedicalBusinessExceptionResource map(MedicalBusinessException medicalBusinessException) {
        return MedicalBusinessExceptionResource.builder()
                .message(medicalBusinessException.getMessage())
                .build();
    }
}
