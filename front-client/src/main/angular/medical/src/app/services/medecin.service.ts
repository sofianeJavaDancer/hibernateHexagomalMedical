import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Medecin} from '../models/medecin';
import {BASE_URL, END_POINTS} from '../constants/url-constants';

@Injectable({
  providedIn: 'root'
})
export class MedecinService {

  medecinEndPoint = BASE_URL + END_POINTS.MEDECIN;

  constructor(private httpClient: HttpClient) { }

  get(id: string): Observable<any> {
    let url = this.medecinEndPoint + '/:id';
    url = url.replace(':id', id);
    return this.httpClient.get(url);
  }

  getAll(): Observable<any> {
    let url = this.medecinEndPoint;
    return this.httpClient.get(url);
  }

}
