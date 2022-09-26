import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Meeting} from '../models/meeting';
import {BASE_URL, END_POINTS} from '../constants/url-constants';

@Injectable({
  providedIn: 'root'
})
export class MeetingService {

  meetingEndPoint = BASE_URL + END_POINTS.MEETING;

  constructor(private httpClient: HttpClient) { }

  get(id: string): Observable<any> {
    let url = this.meetingEndPoint + '/:id';
    url = url.replace(':id', id);
    return this.httpClient.get(url);
  }

  getAll(): Observable<any> {
    let url = this.meetingEndPoint;
    return this.httpClient.get(url);
  }

  add(meeting: Meeting): Observable<any> {
    let url = this.meetingEndPoint + '/create';
    return this.httpClient.post(url, meeting);
  }
}
