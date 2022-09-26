import { Component, OnInit } from '@angular/core';
import { NgbModal} from '@ng-bootstrap/ng-bootstrap';
import { forkJoin } from 'rxjs';

import {MeetingService} from '../../services/meeting.service';
import {MedecinService} from '../../services/medecin.service';
import {PatientService} from '../../services/patient.service';

import {Meeting} from '../../models/meeting';
import {Medecin} from '../../models/medecin';
import {Patient} from '../../models/patient';

import {MeetingModalComponent} from './meeting-modal/meeting-modal.component';

@Component({
  selector: 'app-meeting',
  templateUrl: './meeting.component.html',
  styleUrls: ['./meeting.component.scss']
})
export class MeetingComponent implements OnInit {

  public meetings: Meeting[] = [];

  constructor(private meetingService: MeetingService,
  private medecinService: MedecinService,
  private patientService: PatientService,
  private modalService: NgbModal) { }

  ngOnInit(): void {
    this.meetingService.getAll().subscribe((meetings: any) => {
      this.meetings = meetings;
    });
  }

  addMeeting() {
    let forkjoinObject = {medecins: this.medecinService.getAll(), patients: this.patientService.getAll()};
    forkJoin(forkjoinObject).subscribe((result:any) => {

       const modalRef = this.modalService.open(MeetingModalComponent, {size: 'lg'});
        modalRef.componentInstance.patients = result.patients;
        modalRef.componentInstance.medecins = result.medecins;

        modalRef.result.then((meeting: Meeting) => {
          this.meetingService.add(meeting).subscribe((createdMeeting: Meeting) => {

          });
        }, (reason) => {
        });

      });

  }


}
