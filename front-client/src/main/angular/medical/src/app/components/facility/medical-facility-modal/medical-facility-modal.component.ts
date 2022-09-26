import { Component, OnInit } from '@angular/core';
import {NgForm, FormGroup, FormControl} from '@angular/forms';
import {NgbActiveModal, NgbModal} from '@ng-bootstrap/ng-bootstrap';

import {Facility} from '../../../models/facility';


@Component({
  selector: 'app-medical-facility-modal',
  templateUrl: './medical-facility-modal.component.html',
  styleUrls: ['./medical-facility-modal.component.scss']
})
export class MedicalFacilityModalComponent implements OnInit {

  medicalFacility: Facility;
  adresse: string;
  type: string;
  rate: number;
  capacity: string;
  types: string[];
  $$displayType = false;

  medicalFacilityFormGroup: FormGroup;

  constructor(public activeModal: NgbActiveModal) {

    this.types = ["GENERIC", "HOSPITAL", "CLINIQUE"];
   }

  ngOnInit(): void {
   const adresseFormControl = new FormControl(this.adresse);
   const rateFormControl = new FormControl(this.rate);
   const capacityFormControl = new FormControl(this.capacity)
    this.medicalFacilityFormGroup = new FormGroup({
        adresseFormControl: adresseFormControl ,
        rateFormControl:rateFormControl,
        capacityFormControl: capacityFormControl
    });


  }

  selectType(type: string) {
    this.type = type;
    this.$$displayType = false;
  }

  dismiss() {
    this.activeModal.dismiss("annuler");
  }

  create() {

    this.medicalFacility = {
      type: this.type,
      adresse: this.medicalFacilityFormGroup.value.adresseFormControl,
      capacity: this.medicalFacilityFormGroup.value.capacityFormControl,
      rate: this.medicalFacilityFormGroup.value.rateFormControl
    };

    this.activeModal.close(this.medicalFacility);
  }

}
