package com.sof.business.ports;

import com.sof.domain.Facility;
import com.sof.domain.Medecin;
import com.sof.domain.Meeting;

import java.util.Set;

public interface MeetingService {

    Meeting getById(Long id);

    Set<Meeting> getAll();

    Meeting add(Meeting meeting);
}
