import {
  Component,
  OnInit,
  ViewChild,
  Input,
  SimpleChanges,
} from '@angular/core';
import { EmailEditorComponent } from 'angular-email-editor';

@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css'],
})
export class EditorComponent implements OnInit {
  title = 'angular-email-editor';

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
        // Design is updated by the user
        var type = data.type; // body, row, content
        var item = data.item;
        var changes = data.changes;
        console.log('design:updated', type, item, changes);
      }
    );
    // load the design json here
    console.log('this.jsonLoad: ', this.jsonLoad);
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
  options() {
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
