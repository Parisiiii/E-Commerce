
import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import './index.css'

import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";

import Home from './routes/Home.tsx';
import Produtos from './routes/produtos/Produtos.tsx';
import ErrorPage from './routes/ErrorPage.tsx';

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    errorElement: <ErrorPage />,
  },
  {
    path: "/home",
    element: <Home />
  },
  {
    path: "/produtos",
    element: <Produtos />
  }
])


ReactDOM.createRoot(document.getElementById('root')!).render(
  <RouterProvider router={router} />,
)
