import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'projetoTeste';

  constructor(private router:Router){}

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
