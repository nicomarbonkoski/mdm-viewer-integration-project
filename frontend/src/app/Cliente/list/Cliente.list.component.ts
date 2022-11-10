import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import {ServiceService} from '../../service/service.service'
import {Cliente} from 'src/app/Modelo/Cliente'
import { setupTestingRouterInternal } from '@angular/router/testing';

@Component({
  selector: 'app-Cliente.list',
  templateUrl: './Cliente.list.component.html',
  styleUrls: ['./Cliente.list.component.css']
})
export class ListClienteComponent implements OnInit {
  clientes:Cliente[] | undefined;

  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit():void{
    this.service.getCliente().subscribe(data=>{
      this.clientes=data;
    })

    
  }
  editarCliente(cliente:Cliente):void{
    localStorage.setItem("cpf",cliente.cpf.toString());
    this.router.navigate(["Cliente.edit"]);
  }
  delete(cliente:Cliente){
    var retorno = confirm("Todos os dados do CLIENTE "+cliente.nome+" serão deletados.\nTem certeza? ");
    if (retorno == true) {
      this.service.deleteCliente(cliente.cpf).subscribe({});
      alert("Cliente deletado");
      location.reload();
      this.router.navigate(['Medidor.list']);
    } 
  }
}
