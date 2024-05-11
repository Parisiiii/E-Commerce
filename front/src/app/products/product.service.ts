import { Injectable } from '@angular/core';
import { SuperService } from '../super/super.service';

@Injectable({
  providedIn: 'root'
})
export class ProductService extends SuperService<any> {

  constructor() {
    super("produto");
  }
}
