import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Json } from '../shared/models/json';

@Injectable({
  providedIn: 'root',
})
export class JsonService {
  constructor(private http: HttpClient) {}

  getAllJson(): Observable<Json[]> {
    return this.http.get<Json[]>('http://localhost:8080/api/v1/json');
  }

  getJson(id: number) {
    return this.http.get<Json>('http://localhost:8080/api/v1/json/' + id);
  }
}
