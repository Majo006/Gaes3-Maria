import React, { useState } from 'react';
import './login.css';

function LoginForm() {
  const [correoelectronico, setcorreoelectronico] = useState('');
  const [contraseña, setcontraseña] = useState('');
  const history = useHistory(); // Inicializa useHistory

  const handleSubmit = (e) => {
    e.preventDefault();
    // Aquí puedes manejar la lógica de inicio de sesión, por ejemplo, enviar los datos a un servidor
    console.log('Email:', correoelectronico);
    console.log('Contraseña:', contraseña);

    // Redirige al usuario al index
    history.push('/');
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Email:
        <input
          type="email"
          value={correoelectronico}
          onChange={(e) => setcorreoelectronico(e.target.value)}
          required
        />
      </label>
      <label>
        Contraseña:
        <input
          type="password"
          value={contraseña}
          onChange={(e) => setcontraseña(e.target.value)}
          required
        />
      </label>
      <button type="submit">Iniciar sesión</button>
    </form>
  );
}

export default LoginForm;
