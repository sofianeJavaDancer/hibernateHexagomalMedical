package com.sof.business.ports;

import com.sof.domain.Meeting;

import java.util.Set;

public interface MeetingService {

    Meeting getById(Long id);

    Set<Meeting> getAll();

    Meeting add(Meeting meeting);
}
