import { Component, OnInit } from '@angular/core';

import {PatientService} from '../../services/patient.service';
import {Patient} from '../../models/patient';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.scss']
})
export class PatientComponent implements OnInit {

  public patients: Patient[] = [];

  constructor(private patientService: PatientService) { }

  ngOnInit(): void {
    this.patientService.getAll().subscribe((patients: any) => {
      this.patients = patients;
    })
  }



}
