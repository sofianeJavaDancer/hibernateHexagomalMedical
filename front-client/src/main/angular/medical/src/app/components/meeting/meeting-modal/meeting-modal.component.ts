import { Component, OnInit, Input} from '@angular/core';
import {NgbActiveModal, NgbModal} from '@ng-bootstrap/ng-bootstrap';

import {Meeting} from '../../../models/meeting';
import {Medecin} from '../../../models/medecin';
import {Patient} from '../../../models/patient';


@Component({
  selector: 'app-meeting-modal',
  templateUrl: './meeting-modal.component.html',
  styleUrls: ['./meeting-modal.component.scss']
})
export class MeetingModalComponent implements OnInit {

  @Input() patients: Patient[] = [];
  @Input() medecins: Medecin[] = [];

  meeting: Meeting;
  public medecin: Medecin;
  patient: Patient;
  date: string;
  heure: string;

  $$displayMedecin: boolean=false;
  $$displayPatient: boolean=false;

  constructor(public activeModal: NgbActiveModal) {
    this.medecin = null;
   }

  ngOnInit(): void {
    this.date = '2022/11/02';
    this.heure = '18:00:00';
  }

  selectMedecin(medecin: Medecin) {
    this.medecin = medecin;
    this.$$displayMedecin=false;
  }

  selectPatient(patient:Patient) {
    this.patient = patient;
    this.$$displayPatient=false;
  }

  dismiss() {
    this.activeModal.dismiss("annuler");
  }

  create() {
    this.meeting = {
        medecin : this.medecin,
        patient : this.patient,
        date : this.date,
        heure : this.heure
    };

    this.activeModal.close(this.meeting);
  }
}
