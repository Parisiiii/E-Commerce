import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';
import { FormBuilder, FormsModule } from '@angular/forms';

@Component({
  selector: 'app-products',
  standalone: true,
  imports: [
    FormsModule,
  ],
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements OnInit {
  value: any;
  fb?: FormBuilder;

  constructor(
    protected service: ProductService
  ) { }

  ngOnInit(): void {



    this.getProducts();
  }

  getProducts() {
    this.service.get("").then(v => {
      console.log(v);
    });
  }
}
