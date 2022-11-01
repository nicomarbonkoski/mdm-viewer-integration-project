import { LoginComponent } from './login/login.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { TabelaComponent } from './tabela/tabela.component';
import { TelaComponent } from './tela/tela.component';
import { MenuComponent } from './menu/menu.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { sample } from 'rxjs';

const routes: Routes = [
  {
    path: "",
    component: MenuComponent
  },
  {
    path: "listagem",
    component: TabelaComponent
  },
  {
    path: "usuarios",
    component: UsuariosComponent
  },
  {
    path:"login",
    component: LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
