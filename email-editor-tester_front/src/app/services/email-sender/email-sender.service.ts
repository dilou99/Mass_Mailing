import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EmailMessage } from 'src/app/shared/models/emailMessage';

@Injectable({
  providedIn: 'root',
})
export class EmailSenderService {
  constructor(private http: HttpClient) {}

  sendEmail(emailmessage: EmailMessage): Observable<EmailMessage[]> {
    return this.http.post<EmailMessage[]>(
      'http://localhost:8080/api/v1/email',
      emailmessage
    );
  }
}
