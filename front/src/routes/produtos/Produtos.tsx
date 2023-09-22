import axios from "axios";
import { useState, useEffect } from "react";
import ProdutoService from "./ProdutoService";
import { Table, TableBody, TableCell, TableContainer, TableHead, TableRow } from "@mui/material";



const Produtos = () => {
  const service = ProdutoService();
  const [produtos, setProdutos] = useState<Array<string>>();

  const listarProdutos = () => {
    service.getProdutos()
      .then(s => {
        setProdutos(s.data)
        console.log(s.data)
      })
  }

  useEffect(() => {
    listarProdutos();
  }, [])

  return (
    <div>Products</div>
  )
}

export default Produtos