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
import { MenuComponent } from './menu/menu.component';
import {MatCardModule}from'@angular/material/card';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { UserDropdownComponent } from './sidenav/user-dropdown/user-dropdown.component';
import {MatMenuModule} from '@angular/material/menu';
import {MatIconModule} from '@angular/material/icon';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    TabelaComponent,
    SidenavComponent,
    TelaComponent,
    MenuComponent,
    UsuariosComponent,
    UserDropdownComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,

    MatListModule,
    MatSidenavModule,
    MatCardModule,
    MatMenuModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
