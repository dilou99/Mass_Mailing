import {
  Component,
  OnInit,
  ViewChild,
  Input,
  SimpleChanges,
} from '@angular/core';
import { EmailEditorComponent } from 'angular-email-editor';
import { TemplateService } from '../services/template/template.service';
import { Template } from '../shared/models/template';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css'],
})
export class EditorComponent implements OnInit {
  title = 'angular-email-editor';
  savedJson!: string;
  savedHtml!: string;
  templateName: any;
  template: Template = new Template();
  id = +this.route.snapshot.params['id'];

  onSubmit() {
    if (!this.templateName) {
      alert('The template name is required');
      return;
    }
  }
  constructor(
    private templateService: TemplateService,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  @Input() jsonLoad: any;

  @ViewChild(EmailEditorComponent)
  private emailEditor!: EmailEditorComponent;

  ngOnInit(): void {
    console.log(this.id);
    if (this.id > 0) {
      this.templateService.getTemplate(this.id).subscribe((template) => {
        this.templateName = template.name;
      });
    }
  }

  ngOnChanges(changes: SimpleChanges) {
    if (this.emailEditor != null) {
      if ('jsonLoad' in changes) {
        this.editorLoaded();
      }
    }
  }

  editorLoaded() {
    this.emailEditor.editor.addEventListener(
      'design:updated',
      function (data: any) {
        var type = data.type;
        var item = data.item;
        var changes = data.changes;
        console.log('design:updated', type, item, changes);
      }
    );
    if (this.id > 0) {
      this.templateService.getTemplate(this.id).subscribe((template) => {
        this.jsonLoad = template.jsonData;
        const jsonLoadObj = JSON.parse(this.jsonLoad);
        this.emailEditor.editor.loadDesign(jsonLoadObj);
      });
    } else {
      if (this.jsonLoad) {
        const jsonLoadObj = JSON.parse(this.jsonLoad);
        this.emailEditor.editor.loadDesign(jsonLoadObj);
      } else {
        this.emailEditor.editor.loadDesign();
      }
    }
  }

  optionsLoaded() {
    return {
      displayMode: 'web',
      contentWidth: '700px',
      backgroundColor: '#ffffff',
    };
  }
  tools() {
    return {};
  }

  exportHtml() {
    this.emailEditor.editor.exportHtml(
      function (data: any) {
        var json = data.design;
        var html = data.html;
        console.log(json);
        console.log(html);
      },
      {
        cleanup: true,
      }
    );
  }

  saveTemplate(): void {
    this.emailEditor.editor.exportHtml(
      (data: any) => {
        var json = data.design;
        var html = data.html;
        this.savedJson = JSON.stringify(json);
        this.savedHtml = html;
        const currentDate = new Date();

        if (this.templateName) {
          this.template = new Template(
            this.templateName,
            this.savedJson,
            this.savedHtml,
            currentDate
          );
          if (this.id > 0) {
            this.templateService
              .updateTemplate(this.template, this.id)
              .subscribe(() => {
                this.router.navigateByUrl('/template-list');
              });
          } else {
            this.templateService.addTemplate(this.template).subscribe(() => {
              this.router.navigateByUrl('/template-list');
            });
          }
        }
      },
      {
        cleanup: true,
      }
    );
  }

  options(): any {
    return {
      mergeTags: {
        first_name: {
          name: 'First Name',
          value: '{{first_name}}',
        },
        last_name: {
          name: 'Last Name',
          value: '{{last_name}}',
        },
      },
      features: {
        stockImages: {
          enabled: false,
        },
        undoRedo: false,
        textEditor: {
          cleanPaste: false,
        },
      },
    };
  }
  appearance() {
    return {
      theme: 'dark',
      panels: {
        tools: {
          dock: 'right',
        },
      },
    };
  }
}
