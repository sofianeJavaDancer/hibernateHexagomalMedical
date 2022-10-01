package com.sof.business.usecases.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MedicalBusinessException extends RuntimeException {
    private EnumeratedBusinessErrors error;
}
