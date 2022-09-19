package com.sof.business.usecases.impl;

import com.sof.business.ports.MedecinService;
import com.sof.business.ports.MeetingService;
import com.sof.business.usecases.exceptions.MedecinNotAvailableException;
import com.sof.business.usecases.exceptions.NotMedecinPatientException;
import com.sof.business.usecases.service.ScheduleMeetingService;
import com.sof.domain.Medecin;
import com.sof.domain.Meeting;
import com.sof.domain.Patient;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class ScheduleMeetingServiceImpl implements ScheduleMeetingService {

    @Autowired
    private MeetingService meetingService;

    @Autowired
    private MedecinService medecinService;

    @Override
    public Meeting createMeeting(Meeting meeting) {
        Medecin medecin = meeting.getMedecin();
        Patient patient = meeting.getPatient();

        if(!medecinService.checkMedecinAvailable(medecin, meeting.getDate() , meeting.getHeure())){
            // TODO check date from today and time in working hour time
            throw new MedecinNotAvailableException();
        }

        if(!medecinService.checkPatientOfMedecin(meeting.getMedecin() , meeting.getPatient())){
            throw new NotMedecinPatientException();
        }

        return meetingService.add(meeting);
    }
}
