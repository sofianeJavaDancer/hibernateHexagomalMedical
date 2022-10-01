package com.sof.webadapter.controller;

import com.sof.business.usecases.exceptions.MedecinNotAvailableException;
import com.sof.business.usecases.exceptions.MedicalBusinessException;
import com.sof.business.usecases.exceptions.NotMedecinPatientException;
import com.sof.webadapter.mapper.MedicalBusinessExceptionResourceMapper;
import com.sof.webadapter.resources.MedicalBusinessExceptionResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

@ControllerAdvice
public class GlobalControllerErrorHandling extends ResponseEntityExceptionHandler {

    @Autowired
    MedicalBusinessExceptionResourceMapper medicalBusinessErrorResourceMapper;

    @ExceptionHandler(value = {MedicalBusinessException.class})
    public ResponseEntity<MedicalBusinessExceptionResource> handleException(MedicalBusinessException exception, WebRequest request) {

        HttpHeaders httpHeaders = new HttpHeaders();
        if (exception instanceof MedecinNotAvailableException) {
            HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
            var medecinNotAvailableException = (MedecinNotAvailableException) exception;
            return handleMedecinNotAvailable(medecinNotAvailableException, httpHeaders, status, request);
        } else if (exception instanceof NotMedecinPatientException) {
            HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
            var medecinNotPatientException = (MedecinNotAvailableException) exception;
            return handleMedecinNotAvailable(medecinNotPatientException, httpHeaders, status, request);
        } else {
            HttpStatus status = HttpStatus.NOT_FOUND;
            return handleOtherExceptions(exception, httpHeaders, status, request);
        }

    }

    public ResponseEntity<MedicalBusinessExceptionResource> handleMedecinNotAvailable(MedecinNotAvailableException e, HttpHeaders httpHeaders, HttpStatus status, WebRequest request) {
        MedicalBusinessExceptionResource resource = medicalBusinessErrorResourceMapper.fromDomainToResource(e);
        resource.setStatus(status);
        return handleExceptionInternal(e, resource, httpHeaders, status, request);
    }

    public ResponseEntity<MedicalBusinessExceptionResource> handleNotMedecinPatient(NotMedecinPatientException e, HttpHeaders httpHeaders, HttpStatus status, WebRequest request) {
        MedicalBusinessExceptionResource resource = medicalBusinessErrorResourceMapper.fromDomainToResource(e);
        resource.setStatus(status);
        return handleExceptionInternal(e, resource, httpHeaders, status, request);
    }

    public ResponseEntity<MedicalBusinessExceptionResource> handleOtherExceptions(RuntimeException e, HttpHeaders httpHeaders, HttpStatus status, WebRequest request) {
        MedicalBusinessExceptionResource resource = MedicalBusinessExceptionResource.builder()
                .message(e.getMessage())
                .status(status)
                .build();
        return handleExceptionInternal(e, resource, httpHeaders, status, request);
    }


    protected ResponseEntity<MedicalBusinessExceptionResource> handleExceptionInternal(Exception ex, MedicalBusinessExceptionResource body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
        }
        return new ResponseEntity<>(body, headers, status);
    }


}
