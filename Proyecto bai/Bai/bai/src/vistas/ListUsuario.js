import React, { Component } from 'react';

class ListUsuario extends Component {
    render() {
        return (
            <div className='container'>
                <h2 className='text-center'>Lista de Usuarios</h2>
                <table className='table table-bordered table striped'>
                    <thead>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Corre</th>
                        <th>Telefono</th>
                        <th>Tipo de Usuario</th>
                    </thead>
                    <tbody>
                        {
                            usuario.map(
                                usuario=>
                                <tr key={usuario.id}>
                                    <td>{usuario.nombre}</td>
                                    <td>{usuario.apellido}</td>
                                    <td>{usuario.correoelectronico}</td>
                                    <td>{usuario.telefono}</td>
                                    <td>{usuario.tipousuario}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>



            </div>
        );
    }
}

export default ListUsuario;
