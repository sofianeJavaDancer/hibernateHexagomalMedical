package com.sof.business.usecases.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor()
@AllArgsConstructor
@Getter
public enum EnumeratedBusinessErrors {

    MEDECIN_NOT_AVAILABLE_IN_RANGE("Le medecin n'est pas disponible pour ce créneau"),
    NOT_PATIENT_OF_MEDECIN("Le patient n'est pas dans la liste de patients");

    private String message;
}
