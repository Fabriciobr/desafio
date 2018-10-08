
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Registro} from "./registro";

@Injectable({ providedIn: 'root' }) 
export class RegistroService  {

  constructor(private http: HttpClient) {
  }

  public save(bean: any): Observable<any> {
    return this.http.post<any>(`${environment.getBaseURL()}/registro/save`, bean);
  }

} 
