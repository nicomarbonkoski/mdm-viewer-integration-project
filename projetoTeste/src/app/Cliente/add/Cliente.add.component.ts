import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/service/service.service';
import { Cliente } from 'src/app/Modelo/Cliente';

@Component({
  selector: 'Cliente.app-add',
  templateUrl: './Cliente.add.component.html',
  styleUrls: ['./Cliente.add.component.css']
})
export class AddClienteComponent implements OnInit {


  constructor(private router:Router,private service:ServiceService) { }

  ngOnInit(): void {
  }
  cliente: Cliente = new Cliente();
  salvar() {
    this.service.criarCliente(this.cliente)
      .subscribe(data => {
        alert("Cadastro Realizado com sucesso!");
        this.router.navigate(['Cliente.list']);
      }
      )
  }
}
