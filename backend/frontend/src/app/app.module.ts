import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import {  MatSidenavModule  } from '@angular/material/sidenav';
import { MatListModule } from'@angular/material/list';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { TabelaComponent } from './tabela/tabela.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { TelaComponent } from './tela/tela.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    TabelaComponent,
    SidenavComponent,
    TelaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,

    MatListModule,
    MatSidenavModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
