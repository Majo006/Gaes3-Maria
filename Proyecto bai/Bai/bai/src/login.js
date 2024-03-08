import React, { useState } from 'react';
import './login.css'

function LoginForm() {
  const [email, setcorreoelectronico] = useState('');
  const [password, setcontrasena] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    // Aquí puedes manejar la lógica de inicio de sesión, por ejemplo, enviar los datos a un servidor
    console.log('Email:', correoelectronico);
    console.log('Contraseña:', contrasena);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Email:
        <input
          type="email"
          value={contrasena}
          onChange={(e) => setcorreoelectronico(e.target.value)}
          required
        />
      </label>
      <label>
        Contraseña:
        <input
          type="password"
          value={contrasena}
          onChange={(e) => setcontrasena(e.target.value)}
          required
        />
      </label>
      <button type="submit">Iniciar sesión</button>
    </form>
  );
}

export default LoginForm;
