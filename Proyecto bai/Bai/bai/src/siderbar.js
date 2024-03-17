import React from 'react';
import { Sidebar, Menu, MenuItem, SubMenu } from 'react-pro-sidebar';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import {Link} from 'react-router-dom';
import ListUsuario from './vistas/ListUsuario';
import ListCitas from './vistas/ListCitas';
import DashboardUsuario from './dashboarUsuario';

const SidebarComponent = () => {
  return (

    <Sidebar className='siderbar' width="200px">
      <Menu>
        <SubMenu title="Charts" >
          <SubMenu>
          <MenuItem>
          
            <Link to='/listausuario'> 
            Usuario
            </Link>


          </MenuItem>
          <MenuItem>
          <Link to='/AgregarUsuario'>
            Agregar Usuario
            </Link>
          </MenuItem>
          </SubMenu>
          <MenuItem>
          <Link to='/listacitas'>
            Citas
            </Link>
            </MenuItem>
            <MenuItem>
            <Link to='/agregarcita'>
            Agregar Cita
            </Link>
            </MenuItem>
        </SubMenu>

      </Menu>
    </Sidebar>
    

  );
};

export default SidebarComponent;
