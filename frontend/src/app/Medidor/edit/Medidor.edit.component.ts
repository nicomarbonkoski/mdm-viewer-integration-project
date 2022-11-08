import { Component, OnInit } from '@angular/core';
import { Medidor } from 'src/app/Modelo/Medidor';
import { ServiceService } from 'src/app/service/service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './Medidor.edit.component.html',
  styleUrls: ['./Medidor.edit.component.css']
})
export class EditMedidorComponent implements OnInit {
  medidor : Medidor = new Medidor();
  constructor(private router:Router,private  service:ServiceService) { }

  ngOnInit(): void {
  }
  atualizar(medidor:Medidor){
    this.service.updateMedidor(medidor).subscribe(data=>{
      this.router.navigate(["Medidor.list"]);
    })
  }
}
