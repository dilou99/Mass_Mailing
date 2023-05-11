import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { TemplateService } from '../services/template/template.service';
import { Template } from '../shared/models/template';

@Component({
  selector: 'app-template-list',
  templateUrl: './template-list.component.html',
  styleUrls: ['./template-list.component.css'],
})
export class TemplateListComponent implements OnInit {
  templates: Template[] = [];
  p = 1;

  constructor(private templateService: TemplateService) {}

  @Input() inSelect: boolean = false;
  @Output() onSelectTemplate: EventEmitter<any> = new EventEmitter<any>();

  ngOnInit(): void {
    this.templateService.getAllTemplates().subscribe((templates) => {
      this.templates = templates;
    });
  }

  OnDeleteTemplate(id: any): void {
    this.templateService.OnDeleteTemplate(id).subscribe(() => {
      const idx = this.templates.findIndex((c) => c.id === id);
      this.templates.splice(idx, 1);
    });
  }

  preview(htmlContent: any) {
    const previewWindow = window.open(
      '',
      'HTML Preview',
      'width=600,height=400'
    );
    if (previewWindow) {
      previewWindow.document.write(htmlContent);
    }
  }

  handleSelect(id: any) {
    this.onSelectTemplate.emit(id);
  }
}
