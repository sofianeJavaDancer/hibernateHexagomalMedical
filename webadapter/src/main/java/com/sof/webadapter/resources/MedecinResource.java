package com.sof.webadapter.resources;

import com.sof.domain.SpecialityEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MedecinResource {

    private Long id;
    private String name;
    private String speciality;
}
