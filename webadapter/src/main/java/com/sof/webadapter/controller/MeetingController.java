package com.sof.webadapter.controller;

import com.sof.business.ports.MeetingService;
import com.sof.business.usecases.service.ScheduleMeetingService;
import com.sof.domain.Meeting;
import com.sof.webadapter.mapper.MeetingResourceMapper;
import com.sof.webadapter.mapper.MeetingResourceReverseMapper;
import com.sof.webadapter.resources.MeetingResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/meetings")
public class MeetingController {

    @Autowired private MeetingService meetingService;
    @Autowired private ScheduleMeetingService scheduleMeetingService;
    @Autowired private MeetingResourceMapper meetingResourceMapper;
    @Autowired private MeetingResourceReverseMapper meetingResourceReverseMapper;

    @GetMapping("/{id}")
    public MeetingResource getMeeting(@PathVariable Long id) {
        Meeting consultation = meetingService.getById(id);
        return meetingResourceMapper.fromDomainToResource(consultation);
    }

    @GetMapping("")
    public Set<MeetingResource> getAllPatient() {
        Set<Meeting> consultations = meetingService.getAll();
        return meetingResourceMapper.fromDomainToResource(consultations);
    }

    @PutMapping("/create")
    public MeetingResource addMeeting(@RequestBody MeetingResource meetingResource) {

        Meeting meeting = meetingResourceReverseMapper.fromResourceToDomain(meetingResource);
        Meeting savedMeeting = scheduleMeetingService.createMeeting(meeting);
        return meetingResourceMapper.fromDomainToResource(savedMeeting);
    }

}
