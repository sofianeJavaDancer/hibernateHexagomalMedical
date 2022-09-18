import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {PatientComponent} from './components/patient/patient.component';
import {MedecinComponent} from './components/medecin/medecin.component';
import {ConsultationComponent} from './components/consultation/consultation.component';
import {MeetingComponent} from './components/meeting/meeting.component';
import {FacilityComponent} from './components/facility/facility.component';

const routes: Routes = [
{ path: 'patients', component: PatientComponent },
{ path: 'medecins', component: MedecinComponent },
{ path: 'consultations', component: ConsultationComponent },
{ path: 'meetings', component: MeetingComponent },
{ path: 'facilities', component: FacilityComponent },
{ path: '', redirectTo: '/', pathMatch: 'full' }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


