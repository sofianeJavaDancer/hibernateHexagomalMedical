
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientComponent } from './components/patient/patient.component';
import { MedecinComponent } from './components/medecin/medecin.component';
import { ConsultationComponent } from './components/consultation/consultation.component';
import { MeetingComponent } from './components/meeting/meeting.component';
import { FacilityComponent } from './components/facility/facility.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    PatientComponent,
    MedecinComponent,
    ConsultationComponent,
    MeetingComponent,
    FacilityComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
