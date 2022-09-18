import { Component, OnInit } from '@angular/core';

import {MedecinService} from '../../services/medecin.service';
import {Medecin} from '../../models/medecin';

@Component({
  selector: 'app-medecin',
  templateUrl: './medecin.component.html',
  styleUrls: ['./medecin.component.scss']
})
export class MedecinComponent implements OnInit {

  public medecins: Medecin[] = [];

  constructor(private medecinService: MedecinService) { }

  ngOnInit(): void {
    this.medecinService.getAll().subscribe((medecins: any) => {
      this.medecins = medecins;
    })
  }

}
