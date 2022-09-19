import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Facility} from '../models/facility';
import {BASE_URL, END_POINTS} from '../constants/url-constants';
@Injectable({
  providedIn: 'root'
})
export class FacilityService {

  facilityEndPoint = BASE_URL + END_POINTS.FACILITY;

  constructor(private httpClient: HttpClient) { }

  get(id: string): Observable<any> {
    let url = this.facilityEndPoint + '/:id';
    url = url.replace(':id', id);
    return this.httpClient.get(url);
  }

  getAll(): Observable<any> {
    let url = this.facilityEndPoint;
    return this.httpClient.get(url);
  }
}
