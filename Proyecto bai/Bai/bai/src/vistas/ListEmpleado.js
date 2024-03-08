import React, { Component } from 'react';
import PropTypes from 'prop-types';


class ListEmpleado extends Component {
    render() {
        return (
            <div className='container'>
            <h2 className='text-center'>Lista de Empleados</h2>
            <table className='table table-bordered table striped'>
                <thead>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Habilidades</th>
                    <th>Corre</th>
                    <th>Telefono</th>
                </thead>
                <tbody>
                    {
                        empleado.map(
                            empleado=>
                            <tr key={empleado.id}>
                                <td>{empleado.nombre}</td>
                                <td>{empleado.apellido}</td>
                                <td>{empleado.habilidades}</td>
                                <td>{empleado.correoelectronico}</td>
                                <td>{empleado.telefono}</td>
                                <td>{empleado.tipousuario}</td>
                            </tr>
                        )
                    }
                </tbody>
            </table>



        </div>
        );
    }
}


ListEmpleado.propTypes = {

};


export default ListEmpleado;
