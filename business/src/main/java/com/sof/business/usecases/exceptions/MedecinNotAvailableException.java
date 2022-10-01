package com.sof.business.usecases.exceptions;


public class MedecinNotAvailableException extends MedicalBusinessException {

    public MedecinNotAvailableException(){
        super(EnumeratedBusinessErrors.MEDECIN_NOT_AVAILABLE_IN_RANGE);
    }
}
