import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Consultation} from '../models/consultation';
import {BASE_URL, END_POINTS} from '../constants/url-constants';

@Injectable({
  providedIn: 'root'
})
export class ConsultationService {

  consultationEndPoint = BASE_URL + END_POINTS.CONSULTATION;

  constructor(private httpClient: HttpClient) { }

  get(id: string): Observable<any> {
    let url = this.consultationEndPoint + '/:id';
    url = url.replace(':id', id);
    return this.httpClient.get(url);
  }

  getAll(): Observable<any> {
    let url = this.consultationEndPoint;
    return this.httpClient.get(url);
  }
}
