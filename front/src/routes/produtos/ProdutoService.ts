import axios, { AxiosResponse } from "axios"


const ProdutoService = () => {
    const path = "http://localhost:8080/api/v0/produto"
    return {
        async getProdutos(): Promise<AxiosResponse<Array<string>>> {
            return await axios.get(path);
        }
    }
}

export default ProdutoService