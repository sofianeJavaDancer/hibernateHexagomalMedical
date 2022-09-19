import { Component, OnInit } from '@angular/core';

import {MeetingService} from '../../services/meeting.service';
import {MedecinService} from '../../services/medecin.service';
import {PatientService} from '../../services/patient.service';

import {Meeting} from '../../models/meeting';
import {Medecin} from '../../models/medecin';
import {Patient} from '../../models/patient';


@Component({
  selector: 'app-meeting',
  templateUrl: './meeting.component.html',
  styleUrls: ['./meeting.component.scss']
})
export class MeetingComponent implements OnInit {

  public meetings: Meeting[] = [];

  constructor(private meetingService: MeetingService,
  private medecinService: MedecinService,
  private patientService: PatientService) { }

  ngOnInit(): void {
    this.meetingService.getAll().subscribe((meetings: any) => {
      this.meetings = meetings;
    });
  }

  addMeeting() {

  }


}
