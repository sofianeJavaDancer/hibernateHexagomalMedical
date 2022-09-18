import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Patient} from '../models/patient';
import {BASE_URL, END_POINTS} from '../constants/url-constants';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  patientEndPoint = BASE_URL + END_POINTS.PATIENT;

  constructor(private httpClient: HttpClient) { }

  get(id: string): Observable<any> {
    let url = this.patientEndPoint + '/:id';
    url = url.replace(':id', id);
    return this.httpClient.get(url);
  }

  getAll(): Observable<any> {
    let url = this.patientEndPoint;
    return this.httpClient.get(url);
  }

}
