import { Component, OnInit } from '@angular/core';
import { NgbModal} from '@ng-bootstrap/ng-bootstrap';

import {FacilityService} from '../../services/facility.service';
import {Facility} from '../../models/facility';

import {MedicalFacilityModalComponent} from './medical-facility-modal/medical-facility-modal.component';

@Component({
  selector: 'app-facility',
  templateUrl: './facility.component.html',
  styleUrls: ['./facility.component.scss']
})
export class FacilityComponent implements OnInit {

  public facilities: Facility[] = [];

  constructor(private medicalFacilityService: FacilityService, private modalService: NgbModal) { }

  ngOnInit(): void {
    this.medicalFacilityService.getAll().subscribe((facilities: any) => {
      this.facilities = facilities;
    })
  }


  addMedicalFacility() {

       const modalRef = this.modalService.open(MedicalFacilityModalComponent, {size: 'lg'});

        modalRef.result.then((facility: Facility) => {
          this.medicalFacilityService.add(facility).subscribe((createdFacility: Facility) => {

          });
        }, (reason) => {
        });

  }

}
