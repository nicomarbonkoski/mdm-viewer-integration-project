import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/service/service.service';
import { Medidor } from 'src/app/Modelo/Medidor';
@Component({
  selector: 'app-add',
  templateUrl: './Medidor.add.component.html',
  styleUrls: ['./Medidor.add.component.css']
})
export class AddMedidorComponent implements OnInit {

  constructor(private router:Router,private service:ServiceService) { }

  ngOnInit(): void {
  }
  medidor: Medidor = new Medidor();
  salvar() {
    this.service.criarMedidor(this.medidor)
      .subscribe(data => {
        alert("Cadastro Realizado com sucesso!");
        this.router.navigate(['Medidor.list']);
      }
      )
  }
}
