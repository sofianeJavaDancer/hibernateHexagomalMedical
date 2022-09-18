package com.sof.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SpecialityEnum {

    GENERALISTE("Medecin Généraliste"),
    CARDIOLOGUE(""),
    UROLOGUE(""),
    PEDIATRE(""),
    OPHTALMOLOGUE(""),
    PSYCHIATRE("Medecin Psychiatre"),
    PSYCHOLOGUE("Docteur en Psychologie");

    private final String description;
}
