import React, { useState } from 'react';
import { Navigate } from 'react-router-dom'; // Importa Navigate desde react-router-dom
import './registro.css'; // Asegúrate de importar el archivo CSS donde tienes los estilos
import Home from './Home';

function RegistrationForm() {
  const [Nombre, setNombre] = useState('');
  const [Apellido, setApellido] = useState('');
  const [correoelectronico, setcorreoelectronico] = useState('');
  const [contrasena, setcontrasena] = useState('');
  const [isRegistered, setIsRegistered] = useState(false); // Estado para controlar si el usuario está registrado

  const handleSubmit = (e) => {
    e.preventDefault();
    // Lógica de registro
    setIsRegistered(true); // Suponiendo que setIsRegistered es una función que actualiza el estado de registro exitoso
  };

  if (isRegistered) {
    return <Navigate to="/Dashboard" />; // Redirige al usuario a Dashboard si está registrado
  }

  return (
    <div>
      <Home/>
      <div className="body-container">
        <div className="form-container">
          <form className="form" onSubmit={handleSubmit}>
            <div className="label-input">
              <label>Nombre:</label>
              <input
                type="text"
                className="input"
                value={Nombre}
                onChange={(e) => setNombre(e.target.value)}
                required
              />
            </div>
            <div className="label-input">
              <label>Apellido:</label>
              <input
                type="text"
                className="input"
                value={Apellido}
                onChange={(e) => setApellido(e.target.value)}
                required
              />
            </div>
            <div className="label-input">
              <label>Email:</label>
              <input
                type="email"
                className="input"
                value={correoelectronico}
                onChange={(e) => setcorreoelectronico(e.target.value)}
                required
              />
            </div>
            <div className="label-input">
              <label>Contraseña:</label>
              <input
                type="password"
                className="input"
                value={contrasena}
                onChange={(e) => setcontrasena(e.target.value)}
                pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                title="Debe contener al menos un número, una mayúscula, una minúscula y al menos 8 caracteres"
                required
              />
            </div>
            <div className="button-container">
              <button type="submit">Registrarse</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  );
}

export default RegistrationForm;
