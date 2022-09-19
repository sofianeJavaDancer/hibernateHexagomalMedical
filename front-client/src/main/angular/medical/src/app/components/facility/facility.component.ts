import { Component, OnInit } from '@angular/core';

import {FacilityService} from '../../services/facility.service';
import {Facility} from '../../models/facility';

@Component({
  selector: 'app-facility',
  templateUrl: './facility.component.html',
  styleUrls: ['./facility.component.scss']
})
export class FacilityComponent implements OnInit {

  public facilities: Facility[] = [];

  constructor(private facilityService: FacilityService) { }

  ngOnInit(): void {
    this.facilityService.getAll().subscribe((facilities: any) => {
      this.facilities = facilities;
    })
  }

}
