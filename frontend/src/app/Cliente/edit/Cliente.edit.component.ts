import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/service/service.service';
import { Cliente} from 'src/app/Modelo/Cliente'
import { toASCII } from 'punycode';

@Component({
  selector: 'app-edit',
  templateUrl: './Cliente.edit.component.html',
  styleUrls: ['./Cliente.edit.component.css']
})
export class EditClienteComponent implements OnInit {

  cliente : Cliente = new Cliente();

  constructor(private router:Router,private  service:ServiceService) { }

  ngOnInit(): void {
  }
  atualizar(cliente:Cliente){
    this.service.updateCliente(cliente).subscribe(data=>{
      this.router.navigate(["Cliente.list"]);
    })
  }

  voltar(){
    var retorno = confirm("tem certeza? \nTodos os dados não salvos serão perdidos");
    if (retorno == true) {
      alert("retornando ao menu")
      this.router.navigate(['Medidor.list']);
    } 
  }
}
