package com.sof.business.usecases.exceptions;

public class NotMedecinPatientException extends MedicalBusinessException {

    public NotMedecinPatientException() {
        super(EnumeratedBusinessErrors.NOT_PATIENT_OF_MEDECIN);
    }
}
