import { Component, OnInit } from '@angular/core';

import {ConsultationService} from '../../services/consultation.service';
import {Consultation} from '../../models/consultation';

@Component({
  selector: 'app-consultation',
  templateUrl: './consultation.component.html',
  styleUrls: ['./consultation.component.scss']
})
export class ConsultationComponent implements OnInit {

  public consultations: Consultation[] = [];

  constructor(private consultationService: ConsultationService) { }

  ngOnInit(): void {
    this.consultationService.getAll().subscribe((consultations: any) => {
      this.consultations = consultations;
    })
  }

}
