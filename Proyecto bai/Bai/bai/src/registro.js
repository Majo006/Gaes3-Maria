import React, { useState } from 'react';

function RegistrationForm() {
  const [Nombre, setNombre] = useState('');
  const[Apellido, setApellido] = useState('');
  const [correoelectronico, setcorreoelectronico] = useState('');
  const [contrasena, setcontrasena] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    // Aquí puedes manejar la lógica de registro, por ejemplo, enviar los datos a un servidor
    console.log('Nombre:', Nombre);
    console.log('Apellido:', Apellido);
    console.log('Email:', correoelectronico);
    console.log('Contraseña:', contrasena);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Nombre:
        <input
          type="text"
          value={Nombre}
          onChange={(e) => setNombre(e.target.value)}
          required
        />
      </label>
      <label>
        Apellido:
        <input 
        tupe="text"
        value={Apellido}
        onChange={(e) => setApellido(e.target.value)}
        />
      </label>
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
          value={contrasena}
          onChange={(e) => setcontrasena(e.target.value)}
          required
        />
      </label>
      <button type="submit">Registrarse</button>
    </form>
  );
}

export default RegistrationForm;
