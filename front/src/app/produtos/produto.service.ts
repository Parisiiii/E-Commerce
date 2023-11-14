import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ProdutoEntity } from './produto.entity';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  BASE_PATH = "http://localhost:8080/api/v0"
  REQUEST_PATH = "produto"
  constructor(private http: HttpClient) { }

  getAll(): Observable<Array<ProdutoEntity>> {
    return this.http.get<Array<ProdutoEntity>>(`${this.BASE_PATH}/${this.REQUEST_PATH}`);
  }
}
