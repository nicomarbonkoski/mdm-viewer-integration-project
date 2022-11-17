import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { listenerCount } from 'process';
import { ListMedidorComponent } from './Medidor/list/Medidor.list.component';
import { AddMedidorComponent } from './Medidor/add/Medidor.add.component';
import { AddClienteComponent } from './Cliente/add/Cliente.add.component';
import { EditClienteComponent } from './Cliente/edit/Cliente.edit.component';
import { ListClienteComponent } from './Cliente/list/Cliente.list.component';
import { EditMedidorComponent } from './Medidor/edit/Medidor.edit.component';
import { LoginComponent } from './login/login.component';
import { UserinfoComponent } from './userinfo/userinfo.component';


const routes: Routes =  [
  {path:'Medidor.list', component: ListMedidorComponent},
  {path:'Cliente.add', component: AddClienteComponent},
  {path:'Cliente.list', component: ListClienteComponent},
  {path:'Medidor.add', component: AddMedidorComponent},
  {path:'Cliente.edit', component: EditClienteComponent},
  {path:'Medidor.edit', component: EditMedidorComponent},
  {path:'LoginComponent', component: LoginComponent},
  {path:'userinfo', component: UserinfoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
