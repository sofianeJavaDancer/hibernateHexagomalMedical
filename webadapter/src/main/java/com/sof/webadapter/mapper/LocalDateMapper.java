package com.sof.webadapter.mapper;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class LocalDateMapper {

    public String asString(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    public LocalDate asDate(String dateStr) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
