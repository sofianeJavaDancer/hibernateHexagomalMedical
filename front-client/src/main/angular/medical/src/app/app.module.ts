
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientComponent } from './components/patient/patient.component';
import { MedecinComponent } from './components/medecin/medecin.component';
import { ConsultationComponent } from './components/consultation/consultation.component';
import { MeetingComponent } from './components/meeting/meeting.component';
import { FacilityComponent } from './components/facility/facility.component';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MeetingModalComponent } from './components/meeting/meeting-modal/meeting-modal.component';
import { MedicalFacilityModalComponent } from './components/facility/medical-facility-modal/medical-facility-modal.component';
import { ToastComponent } from './components/commun/toast/toast.component';

@NgModule({
  declarations: [
    AppComponent,
    PatientComponent,
    MedecinComponent,
    ConsultationComponent,
    MeetingComponent,
    FacilityComponent,
    MeetingModalComponent,
    MedicalFacilityModalComponent,
    ToastComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
