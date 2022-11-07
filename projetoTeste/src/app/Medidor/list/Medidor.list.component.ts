import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import {ServiceService} from '../../service/service.service'
import {Medidor} from 'src/app/Modelo/Medidor'

@Component({
  selector: 'app-list',
  templateUrl: './Medidor.list.component.html',
  styleUrls: ['./Medidor.list.component.css']
})
export class ListMedidorComponent implements OnInit {
  medidores:Medidor[] | undefined

  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit():void{
    this.service.getMedidor()
    .subscribe(data=>{
      this.medidores=data;
    })
  }
  editar(medidor:Medidor):void{
    localStorage.setItem("id",medidor.id.toString());
    this.router.navigate(["Medidor.edit"]);
  }
  delete(medidor:Medidor):void{
    this.service.deleteMedidor(medidor.id).subscribe(data =>{ 
      alert("Medidor deletado");
      location.reload();
    })
    
  }
} 
