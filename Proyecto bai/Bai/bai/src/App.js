
import img from './img/img.png';
import img_1 from './img/img_1.png';
// Agrega más importaciones si necesitas más imágenes
import './App.css';
import'./nosotros.js'
import Dashboard from './Dashboard.js';
import ListUsuario from './vistas/ListUsuario.js';
import { BrowserRouter, Route, Routes } from 'react-router-dom';



function App() {
  return (
    <div className="App">

<BrowserRouter>
<Routes>
  <Route path="/Dashboard" element={<Dashboard/>}></Route>
</Routes>
</BrowserRouter>

      <header className="App-header">
        

        <img src={img}  className="App-logo" alt="logo"/>
        <nosotros/>

      </header>

      <div className='App-header2'>
        <a className="botonN" href="#">Nosotros</a>
        <a className="botonN" href="#">Servicios</a>
        <a className="botonN" href="#">Iniciar Sesión</a>
        <a className="botonN" href='#'>Registrarse</a>
        <a className='botonN' href='./Dashboard'>Dashboard</a>

      </div>
      <ListUsuario/>

    </div>
  );
}

export default App;
