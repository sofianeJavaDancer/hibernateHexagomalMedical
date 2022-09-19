package com.sof.dbadapter.service;

import com.sof.business.ports.MeetingService;
import com.sof.dbadapter.entities.RendezVousEntity;
import com.sof.dbadapter.mapper.MeetingEntityMapper;
import com.sof.dbadapter.mapper.MeetingEntityReverseMapper;
import com.sof.dbadapter.repository.MeetingRepository;
import com.sof.domain.Meeting;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private MeetingEntityMapper meetingEntityMapper;

    @Autowired
    private MeetingEntityReverseMapper meetingEntityReverseMapper;

    @Override
    public Meeting getById(Long id) {
        RendezVousEntity rendezVousEntity = meetingRepository.findById(id).get();
        final Meeting meeting = meetingEntityMapper.fromAdapterToDomain(rendezVousEntity);
        return meeting;
    }

    @Override
    public Set<Meeting> getAll() {
        List<RendezVousEntity> meetingEntities = meetingRepository.findAll();
        final Set<Meeting> patients = meetingEntityMapper.fromAdapterToDomain(meetingEntities);
        return patients;
    }

    @Override
    public Meeting add(Meeting meeting) {
        RendezVousEntity rendezVous = meetingEntityReverseMapper.fromDomainToAdapter(meeting);
        RendezVousEntity savedRendezVous = meetingRepository.save(rendezVous);
        return meetingEntityMapper.fromAdapterToDomain(savedRendezVous);
    }

}
