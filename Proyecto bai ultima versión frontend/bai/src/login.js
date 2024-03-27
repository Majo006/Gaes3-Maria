import React, { useState } from 'react';
import './login.css';
import { Navigate } from 'react-router-dom';
import App from './App';
import Home from './Home';

function LoginForm() {
  const [correoelectronico, setcorreoelectronico] = useState('');
  const [contraseña, setcontraseña] = useState('');
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log('Email:', correoelectronico);
    console.log('Contraseña:', contraseña);
    setIsLoggedIn(true);
  };

  if (isLoggedIn) {
    return <Navigate to="/Dashboard" />;
  }
  return (

    <div>
          <Home/>
      <div className='container'>
        <div className='row'>
          <div className='card col-md-6 offset-md-3 offset-md-3'>
            <h2 className='text-center'>Inicio de Sesión</h2>
            <div className='card-body'>
              <form onSubmit={handleSubmit}>
                <div className='form-group mb-2'>
                  <label className='form-label'>Correo Electrónico</label>
                  <input
                    type="email"
                    className="form-control"
                    placeholder='Correo Electrónico'
                    value={correoelectronico}
                    onChange={(e) => setcorreoelectronico(e.target.value)}
                    required
                  />
                </div>
                <div className='form-group mb-2'>
                  <label className='form-label'>Contraseña</label>
                  <input
                    type="password"
                    className="form-control"
                    placeholder='Contraseña'
                    value={contraseña}
                    onChange={(e) => setcontraseña(e.target.value)}
                    required
                  />
                </div>
                <button type="submit" className="btn btn-primary">Iniciar sesión</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default LoginForm;
