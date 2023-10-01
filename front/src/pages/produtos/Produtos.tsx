import { useState, useEffect } from "react";
import ProdutoService, { IProduto } from "./ProdutoService";
import { Card, CardActions, CardContent, CardMedia, TextField, ThemeProvider } from "@mui/material";
import "./Produtos.css";
import { currencyOf } from "../../utils/utils";
import { primaryColor, secondaryColor } from "../../utils/style";

const Produtos = () => {

  const service = ProdutoService();
  const [produtos, setProdutos] = useState<Array<IProduto>>();

  const listarProdutos = () => {
    service.getProdutos()
      .then(s => setProdutos(s))
  };

  const clickhandler = () => {
    return (event: React.MouseEvent) => {
      console.log("Cliquei")
      event.preventDefault();
    }
  }

  const CardDeProdutos = () => {
    return <>
      {produtos?.map((produto) => {
        return <div className="produtos" key={produto.id}>
          <Card sx={{ height: '400px', width: '300px' }}>
            <CardMedia sx={{ height: '250px' }}
              component='img'
              image={produto.imagemProduto}
              title="imagem aleatoria"
            />

            <CardContent sx={{ height: '50px' }}>
              <p>{produto.nome}</p>
              <p>{currencyOf(produto.preco)}</p>
            </CardContent>
            <CardActions sx={{ height: '50px' }}>
              <button onClick={clickhandler()}>Mostrar mais</button>
            </CardActions>
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
      <ThemeProvider theme={secondaryColor}>
        <div className="header">
          <h1>Produtos</h1>
          <TextField id="standard-basic" label="Procurar por nome do produto" variant="standard" className="input" color="primary" />
        </div>

        <div className="listagemProdutos">
          {CardDeProdutos()}
        </div>
      </ThemeProvider>
    </>
  )
}

export default Produtos