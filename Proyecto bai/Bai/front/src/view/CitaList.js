import React, { Component } from 'react';
import PropTypes from 'prop-types';


class CitaList extends Component {
    render() {
        return (
            <div className='container'>
            <h2 className='text-center'>Lista de Citas</h2>
            <table className='table table-bordered table striped'>
                <thead>
                    <th>Id</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>Confirmacion</th>
                    <th>Usuario</th>
                    <th>Empleado</th>
                    <th>Estado</th>
                    <th>Servicio</th>
                </thead>
                <tbody>
                    {
                        cita.map(
                            cita=>
                            <tr key={cita.id}>
                                <td>{cita.fecha}</td>
                                <td>{cita.hora}</td>
                                <td>{cita.confirmacion}</td>
                                <td>{cita.usuario}</td>
                                <td>{cita.empleado}</td>
                                <td>{cita.estado}</td>
                                <td>{cita.servicio}</td>
                                
                            </tr>
                        )
                    }
                </tbody>
            </table>



        </div>
        );
    }
}



export default CitaList;
