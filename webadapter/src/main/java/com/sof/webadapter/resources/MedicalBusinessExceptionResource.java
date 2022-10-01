package com.sof.webadapter.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@Setter
public class MedicalBusinessErrorResource extends RuntimeException {

    private String message;
    public MedicalBusinessErrorResource(String message) {
        super(message);
    }
}
