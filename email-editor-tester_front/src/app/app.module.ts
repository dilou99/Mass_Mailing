import { EmailEditorModule } from 'angular-email-editor';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { GallerieComponent } from './gallerie/gallerie.component';
import { EditorComponent } from './editor/editor.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [AppComponent, GallerieComponent, EditorComponent],
  imports: [
    BrowserModule,
    EmailEditorModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
