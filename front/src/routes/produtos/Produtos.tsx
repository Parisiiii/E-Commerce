import { useState, useEffect, ReactNode } from "react";
import ProdutoService, { IProduto } from "./ProdutoService";
import React from "react";
import { Table, TableBody, TableCell, TableHead, TableRow } from "@mui/material";



const Produtos = () => {
  const service = ProdutoService();
  const [produtos, setProdutos] = useState<Array<IProduto>>();

  const listarProdutos = () => {
    service.getProdutos()
      .then(s => setProdutos(s))
  };

  const TabelaDeProdutos = () => {
    return <>
      <div>
        <Table>
          <TableHead>
            <TableRow>
              <TableCell sx={{color:'white'}}>Produto: </TableCell>
              <TableCell sx={{color:'white'}}>Número do produto: </TableCell>
              <TableCell sx={{color:'white'}}>Preço: </TableCell>
            </TableRow>
          </TableHead>
          {produtos?.map((produto) => (
            <TableRow
              key={produto.identificacao}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}>

                <TableCell component="th" scope="produto">{produto.identificacao}</TableCell>
                <TableCell align="center" sx={{height:'100px'}}>{produto.numero}</TableCell>
                <TableCell align="center">{produto.preco}</TableCell>
            </TableRow>
          ))}
          <TableBody>

          </TableBody>
        </Table>
      </div>
    </>
  }

  useEffect(() => {
    listarProdutos();
  }, [])

  return (
    <div>
      Products: <ul>{TabelaDeProdutos()}</ul>
    </div>
  )
}

export default Produtos