import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Dashboard from './Dashboard.js';
import ListUsuario from './vistas/ListUsuario.js';
import AgregarUsuario from './Usuarios/AgregarUsuario.js';
import ListCitas from './vistas/ListCitas.js';
import LoginForm from './login.js';
import HeaderComponents from './components/headerComponents.js';
import AgregarCita from './vistas/Citas/AgregarCita.js';
import FooterComponent from './components/FooterComponent.js';
import Nosotros from './nosotros.js';
import RegistrationForm from './registro.js';
import dashboarUsuario from './dashboarUsuario.js';
import Home from './Home.js';
import Paginap from './paginap.js';
import HeaderPrincipalComponent from './components/HeaderPrincipalComponent.js';

function App() {
  return (
    <div className="App">
       
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Nosotros/>} />
          <Route path='/Header' element={<HeaderComponents />} />
          <Route path="/Dashboard" element={<Dashboard />} />
          <Route path='/AgregarUsuario' element={<AgregarUsuario />} />
          <Route path='/dashboarusuario' element={<dashboarUsuario />} />
          <Route path='/listausuario' element={<ListUsuario />} />
          <Route path='/login' element={<LoginForm />} />
          <Route path='/registro' element={<RegistrationForm />} />
          <Route path='/listacitas' element={<ListCitas/>} />
          <Route path='/agregarcita' element={<AgregarCita />} />
          <Route path='/footer' element={<FooterComponent />} />
          <Route path='/nosotros' element={<Nosotros />} />
          <Route path='/agregarcita' element={<AgregarCita/>} />
          <Route path='/principal' element={<Paginap/>}/>
          <Route path='/header2' element={<HeaderPrincipalComponent/>}></Route>
        </Routes>
      </BrowserRouter>
      
    </div>
  );
}

export default App;
