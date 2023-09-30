import { useState, useEffect } from "react";
import ProdutoService, { IProduto } from "./ProdutoService";
import { Card, CardActionArea, CardActions, CardContent, CardMedia, TextField } from "@mui/material";
import "./Produtos.css";
import { currencyOf } from "../../utils/utils";

const Produtos = () => {
  const service = ProdutoService();
  const [produtos, setProdutos] = useState<Array<IProduto>>();

  const listarProdutos = () => {
    service.getProdutos()
      .then(s => setProdutos(s))
  };

  const CardDeProdutos = () => {
    return <>
      {produtos?.map((produto) => {
        return <div className="produtos">
          <Card sx={{ height: '300px', width: '300px' }} key={produto.id}>
            <CardActionArea>
              <CardMedia sx={{ height: '150px' }}
                image="data:image/jpeg;base64,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"
                title="imagem aleatoria"
              />

              <CardContent sx={{ height: '60px' }}>
                <p>{produto.nome}</p>
                <p>{currencyOf(produto.preco)}</p>
              </CardContent>
              <CardActions>
                <button>Mostrar mais</button>
              </CardActions>
            </CardActionArea>

          </Card>
        </div>
      })}
    </>
  }

  useEffect(() => {
    listarProdutos();
  }, [])

  return (
    <>
      <div className="header">
        <h1>Produtos</h1>
        <TextField id="standard-basic" label="Standard" variant="standard" className="input" />
      </div>

      <div className="listagemProdutos">
        {CardDeProdutos()}
      </div>
    </>
  )
}

export default Produtos