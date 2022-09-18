package com.sof.dbadapter.service;

import com.sof.business.ports.MeetingService;
import com.sof.dbadapter.entities.RendezVousEntity;
import com.sof.dbadapter.entities.StructureHospitaliereEntity;
import com.sof.dbadapter.mapper.MeetingEntityMapper;
import com.sof.dbadapter.repository.MeetingRepository;
import com.sof.domain.Facility;
import com.sof.domain.Meeting;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private MeetingEntityMapper meetingEntityMapper;

    public Meeting getById(Long id) {
        RendezVousEntity rendezVousEntity = meetingRepository.findById(id).get();
        final Meeting meeting = meetingEntityMapper.fromAdapterToDomain(rendezVousEntity);
        return meeting;
    }
}
