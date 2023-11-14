import { Component, OnInit } from '@angular/core';
import { ProdutoService } from './produto.service';
import { ProdutoEntity } from './produto.entity';

@Component({
  selector: 'app-produtos',
  templateUrl: './produtos.component.html',
  styleUrls: ['./produtos.component.css']
})
export class ProdutosComponent implements OnInit {
  produtos: Array<ProdutoEntity> = [];


  constructor(
    private service: ProdutoService
  ) { }

  ngOnInit(): void {
    this.service.getAll().subscribe({
      next: v => {
        this.produtos = v;
        console.log(this.produtos)
      },
      error: e => {
        console.log(e)
      }
    });
  }



}
