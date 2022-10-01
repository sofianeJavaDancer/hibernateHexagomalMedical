package com.sof.webadapter.resources;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MedicalBusinessExceptionResource {

    private HttpStatus status;
    private String message;
    private List<String> errors = new ArrayList<>();
}
