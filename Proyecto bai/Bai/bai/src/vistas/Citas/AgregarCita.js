import React, { useState } from 'react';
import Dashboard from '../../Dashboard';
import ListCitas from '../ListCitas';

const AgregarCita = () => {
    const [fecha, setFecha] = useState('');
    const [hora, setHora] = useState('');
    const [confirmacion, setConfirmacion] = useState('');
    const [usuario, setUsuario] = useState('');
    const [empleado, setEmpleado] = useState('');
    const [estado, setEstado] = useState('');
    const [servicio, setServicio] = useState('');
    const [agregada, setAgregada] = useState(false);

    const guardarCita = (e) => {
        e.preventDefault();

        // Obtener fecha y hora actual
        const now = new Date();
        const today = new Date(now.getFullYear(), now.getMonth(), now.getDate());

        // Convertir la fecha seleccionada a objeto Date
        const selectedDate = new Date(fecha);
        const selectedTime = new Date(`${fecha}T${hora}`);

        // Validar que la fecha seleccionada no sea antes de hoy
        if (selectedDate < today) {
            alert('No puedes seleccionar una fecha pasada o del mismo día');
            return;
        }

        // Validar que la hora seleccionada no haya pasado en el día actual
        if (selectedDate.getTime() === today.getTime() && selectedTime < now) {
            alert('No puedes seleccionar una hora pasada');
            return;
        }

        // Resto del código para guardar la cita
        const cita = { fecha, hora, confirmacion, usuario, empleado, estado, servicio };
        console.log(cita);

        setTimeout(() => {
            setAgregada(true);
        }, 1000);
    }

    if (agregada) {
        return <ListCitas />;
    }

    return (
        <div>
            <Dashboard/>
            <div className='container'>
                <div className='row'>
                    <div className='card col-md-6 offset-md-3 offset-md-3'>
                        <h2 className='text-center'>Agregar Cita</h2>
                        <div className='card-body'>
                            <form onSubmit={guardarCita}>
                                <div className='form-group mb-2'>
                                    <label className='form-label'>Fecha</label>
                                    <input
                                        type="date"
                                        className="form-control"
                                        value={fecha}
                                        onChange={(e) => setFecha(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'>Hora</label>
                                    <input
                                        type="time"
                                        className="form-control"
                                        value={hora}
                                        onChange={(e) => setHora(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'>Usuario</label>
                                    <input
                                        type="text"
                                        className="form-control"
                                        value={usuario}
                                        onChange={(e) => setUsuario(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'>Empleado</label>
                                    <input
                                        type="text"
                                        className="form-control"
                                        value={empleado}
                                        onChange={(e) => setEmpleado(e.target.value)}
                                    />
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'>Estado</label>
                                    
                                    <select
                                    className="form-control"
                                    value={estado}
                                    onChange={(e) => setEstado(e.target.value)}
                                       >
                                    <option value="">Seleccionar Estado</option>
                                    <option value="Agednada">Agendada</option>
                                    <option value="Cancelada">Cancelada</option>
                                    <option value="Reagendada">Reagendada</option>
                                    <option value='Reagendada por Empleado'>Reagendada por empleado</option>
                                    <option value='Cancelada por Empleado'>Cancelada por empleado</option>
                                </select>
                                </div>
                                <div className='form-group mb-2'>
                                    <label className='form-label'>Servicio</label>
                                    <input
                                        type="text"
                                        className="form-control"
                                        value={servicio}
                                        onChange={(e) => setServicio(e.target.value)}
                                    />
                                </div>
                                <button type="submit" className="btn btn-primary">Guardar Cita</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default AgregarCita;
