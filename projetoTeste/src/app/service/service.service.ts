import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import {Medidor} from '../Modelo/Medidor';
import {Cliente} from '../Modelo/Cliente';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {


  constructor(private http:HttpClient) { }
  Url = 'http://localhost:8080/medidores';
  UrlCliente = 'http://localhost:8080/clientes';
  
  getMedidor(){
    return this.http.get<Medidor[]>(this.Url); 
  }

  getCliente(){
    return this.http.get<Cliente[]>(this.UrlCliente); 
  }

  criarCliente(cliente:Cliente){
    return this.http.post<Cliente>(this.UrlCliente,cliente);
  }
  getClienteById(cpf:String){
    return this.http.get<Cliente>(this.UrlCliente+"/"+ cpf );
  }
  updateCliente(cliente:Cliente){
    return this.http.put<Cliente>(this.UrlCliente+"/"+localStorage.getItem("cpf"),cliente );
  }
  getMedidorById(id:number){
    return this.http.get<Medidor>(this.Url+"/"+id);
  }
  updateMedidor(medidor:Medidor){
    console.log(this.Url+"/"+medidor.id,medidor);
    return this.http.put<Medidor>(this.Url+"/"+localStorage.getItem("id"),medidor);
  }
  criarMedidor(medidor:Medidor){
    return this.http.post<Medidor>(this.Url,medidor);
  }
  deleteMedidor(medidor:number){
    console.log(this.Url+"/"+medidor);
    return this.http.delete(this.Url+"/"+medidor)
  }
  deleteCliente(cliente:String){
    console.log(this.UrlCliente+"/"+cliente);
    return this.http.delete(this.UrlCliente+"/"+cliente)
  }
} 
