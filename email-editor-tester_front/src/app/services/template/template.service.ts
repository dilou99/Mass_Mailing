import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Template } from 'src/app/shared/models/template';

@Injectable({
  providedIn: 'root',
})
export class TemplateService {
  table: Template[] = [];

  constructor(private http: HttpClient) {}

  getAllTemplates(): Observable<Template[]> {
    return this.http.get<Template[]>('http://localhost:8080/api/v1/template');
  }

  getTemplate(id: number) {
    return this.http.get<Template>(
      'http://localhost:8080/api/v1/template/' + id
    );
  }

  addTemplate(template: Template): Observable<Template[]> {
    return this.http.post<Template[]>(
      'http://localhost:8080/api/v1/template',
      template
    );
  }

  OnDeleteTemplate(id: number): Observable<Template[]> {
    return this.http.delete<Template[]>(
      'http://localhost:8080/api/v1/template/' + id
    );
  }

  updateTemplate(Template: Template, id: any): Observable<Template[]> {
    return this.http.put<Template[]>(
      'http://localhost:8080/api/v1/template/' + id,
      Template
    );
  }
}
