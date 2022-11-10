import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  Listar(){
    this.router.navigate(["Medidor.list"])
  }
  novoCliente(){
    this.router.navigate(["Cliente.add"])  
  }
  novoMedidor(){
    this.router.navigate(["Medidor.add"])  
  }
  ListarClientes(){
    this.router.navigate(["Cliente.list"])
  }
}
