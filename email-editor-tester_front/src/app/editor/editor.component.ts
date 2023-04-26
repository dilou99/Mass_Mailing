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

@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css'],
})
export class EditorComponent implements OnInit {
  title = 'angular-email-editor';
  savedJson!: string;
  savedHtml!: string;
  templateName: string = '';
  template: Template = new Template();

  onSubmit() {
    if (!this.templateName) {
      alert('The template name is required');
      return;
    }

    console.log('Template name:', this.templateName);
  }
  constructor(private templateService: TemplateService) {}

  @Input() jsonLoad: any;

  @ViewChild(EmailEditorComponent)
  private emailEditor!: EmailEditorComponent;

  ngOnInit(): void {}

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
    const jsonLoadObj = JSON.parse(this.jsonLoad);
    this.emailEditor.editor.loadDesign(jsonLoadObj);
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
        console.log(this.savedHtml, this.savedJson);
        const currentDate = new Date();
        if (this.templateName) {
          this.template = new Template(
            this.templateName,
            this.savedJson,
            this.savedHtml,
            currentDate
          );
          console.log(this.template);
          this.templateService.addTemplate(this.template).subscribe();
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
