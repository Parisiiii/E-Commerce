import { Inject, Injectable } from '@angular/core';
import axios from 'axios';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SuperService<T> {
  basePath: string = "http://localhost:8080/api/v0";
  path: string;
  constructor(
    @Inject(String) path: string,
  ) {
    this.path = path;
  }

  get(request: string) {
    return axios.get<T>(`${this.basePath}/${this.path}/${request}`);
  }

  save() {

  }

}
