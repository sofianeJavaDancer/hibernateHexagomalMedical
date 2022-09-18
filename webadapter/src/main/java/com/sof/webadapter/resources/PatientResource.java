package com.sof.webadapter.resources;

import com.sof.domain.Medecin;
import com.sof.domain.Meeting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientResource {

    private long id;
    private String name;
    private String insurance;
    private String email;

    Set<MedecinResource> medecins;

    Set<MeetingResource> meetings;
}
