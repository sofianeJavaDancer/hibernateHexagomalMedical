package com.sof.business.ports;

import com.sof.domain.Medecin;
import com.sof.domain.Meeting;

public interface MeetingService {

    Meeting getById(Long id);
}
