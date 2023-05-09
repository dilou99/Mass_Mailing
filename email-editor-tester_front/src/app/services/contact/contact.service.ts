import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Contact } from 'src/app/shared/models/contact';

@Injectable({
  providedIn: 'root',
})
export class ContactService {
  constructor(private http: HttpClient) {}

  getAllContacts(): Observable<Contact[]> {
    return this.http.get<Contact[]>('http://localhost:8080/api/v1/contact');
  }

  getContact(id: number) {
    return this.http.get<Contact>('http://localhost:8080/api/v1/contact/' + id);
  }
}
