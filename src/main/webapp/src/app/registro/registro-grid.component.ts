import {Component, OnInit} from '@angular/core';
import {Registro} from "./registro";
import {RegistroService} from "./registro.service";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'registro-grid',
  templateUrl: './registro-grid.component.html',
  styleUrls: ['./registro-grid.component.css']
})

export class RegistroGridComponent {

  public newString: string;

  constructor(private service:RegistroService){
    this.newString = ""
  }
  protected registroList: Registro[] = new Array();


  saveRegistro() {
    let reg = this.service.save(<Registro>{vogal:"",mensagem:"",string:this.newString}).subscribe(response => {
      this.registroList.push(response);
    });
  }


}
