package com.sof.webadapter.resources;

import com.sof.domain.Meeting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsultationResource {

    private long id;
    private String rapport;
    private MeetingResource meeting;
}
