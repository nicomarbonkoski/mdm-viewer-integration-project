import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ListMedidorComponent } from './Medidor/list/Medidor.list.component';
import { AddClienteComponent } from './Cliente/add/Cliente.add.component';
import { DeleteMedidorComponent } from './Medidor/delete/Medidor.delete.component';
import { AddMedidorComponent } from './Medidor/add/Medidor.add.component';
import { EditMedidorComponent } from './Medidor/edit/Medidor.edit.component';
import { ListClienteComponent } from './Cliente/list/Cliente.list.component';
//import { AddClienteComponent } from './Cliente/add/Cliente.add.component';
//import { DeleteClienteComponent } from './Cliente/delete/Cliente.delete.component';
import { EditClienteComponent } from './Cliente/edit/Cliente.edit.component';
import { FormsModule } from '@angular/forms';
import { ServiceService } from '../app/service/service.service';
import{HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ListMedidorComponent,
    AddClienteComponent,
    DeleteMedidorComponent,
    EditMedidorComponent,
    ListClienteComponent,
   // AddClienteComponent,
    //DeleteClienteComponent,
    EditClienteComponent,
    AddMedidorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
