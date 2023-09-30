import axios from "axios";
import { SetStateAction } from "react";

export type IProduto = {
    id: number,
    uuid: string,
    numero: number,
    nome: string,
    preco: number,
}

const ProdutoService = () => {
    const path = "http://localhost:8080/api/v0/produto"
    return {
        async getProdutos(): Promise<SetStateAction<IProduto[] | undefined>> {
            return await axios.get(path).then(response => response.data);
        }
    }
}

export default ProdutoService