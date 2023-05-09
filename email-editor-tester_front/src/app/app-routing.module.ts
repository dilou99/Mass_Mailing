import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { EditorComponent } from './editor/editor.component';
import { GallerieComponent } from './gallerie/gallerie.component';
import { TemplateListComponent } from './template-list/template-list.component';

const routes: Routes = [
  { path: 'gallerie', component: GallerieComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'editor/:id', component: EditorComponent },
  { path: 'template-list', component: TemplateListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
