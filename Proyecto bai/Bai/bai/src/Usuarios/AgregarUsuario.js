import React, { useState } from 'react';

export const AgregarUsuario = () => {
    const [nombre, setNombre] = useState('');
    const [apellido, setApellido] = useState('');
    const [correoelectronico, setCorreoelectronico] = useState('');
    const [telefono, setTelefono] = useState('');
    const [contraseña, setContraseña] = useState('');
    const [tipousuario, setTipoUsuario] = useState('');

    const savedUsuario = (e) => {
        e.preventDefault();
        const usuario = { nombre, apellido, correoelectronico, telefono, contraseña, tipousuario };
        console.log(usuario);
    }

    return (
        <div>
            <div className='container'>
                <div className='row'>
                    <div className='card col-md-6 offset-md-3 offset-md-3'>
                        <h2 className='text-center'>Agregar Usuario</h2>
                        <div className='card-body'>
                            <form onSubmit={savedUsuario}>
                                <div className='form-group mb-2'>
                                    <label className='form-label'> Nombre</label>
                                    <input
                                        type="text"
                                        className="form-control"
                                        placeholder='Nombre'
                                        value={nombre}
                                        onChange={(e) => setNombre(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'> Apellido</label>
                                    <input
                                        type="text"
                                        className="form-control"
                                        placeholder='Apellido'
                                        value={apellido}
                                        onChange={(e) => setApellido(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'> Correo Electrónico</label>
                                    <input
                                        type="email"
                                        className="form-control"
                                        placeholder='Correo Electrónico'
                                        value={correoelectronico}
                                        onChange={(e) => setCorreoelectronico(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'> Teléfono</label>
                                    <input
                                        type="text"
                                        className="form-control"
                                        placeholder='Teléfono'
                                        value={telefono}
                                        onChange={(e) => setTelefono(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'> Contraseña</label>
                                    <input
                                        type="password"
                                        className="form-control"
                                        placeholder='Contraseña'
                                        value={contraseña}
                                        onChange={(e) => setContraseña(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'> Tipo de Usuario</label>
                                    <select
                                        className="form-control"
                                        value={tipousuario}
                                        onChange={(e) => setTipoUsuario(e.target.value)}
                                    >
                                        <option value="">Seleccionar Tipo</option>
                                        <option value="admin">Administrador</option>
                                        <option value="normal">Normal</option>
                                    </select>
                                </div>
                                <button type="submit" className="btn btn-primary">Guardar Usuario</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default AgregarUsuario;
