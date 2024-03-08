import React, { Component } from 'react';
import PropTypes from 'prop-types';


class ListRecordatorios extends Component {
    render() {
        return (
            <div className='container'>
            <h2 className='text-center'>Lista de Recordatorios</h2>
            <table className='table table-bordered table striped'>
                <thead>
                    <th>Id</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>Mensaje</th>
                    <th>Estado</th>
                </thead>
                <tbody>
                    {
                        recordatorio.map(
                            recordatorio=>
                            <tr key={recordatorio.id}>
                                <td>{recordatorio.fecha}</td>
                                <td>{recordatorio.hora}</td>
                                <td>{recordatorio.mensaje}</td>
                                <td>{recordatorio.estado_recordatorio}</td>
                                
                            </tr>
                        )
                    }
                </tbody>
            </table>



        </div>
        );
    }
}


ListRecordatorios.propTypes = {

};


export default ListRecordatorios;
