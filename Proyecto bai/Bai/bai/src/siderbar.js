import React from 'react';
import { Sidebar, Menu, MenuItem, SubMenu } from 'react-pro-sidebar';
import './App.css';

const SidebarComponent = () => {
  return (
    <Sidebar className='siderbar' width="200px">
      <Menu>
        <SubMenu title="Charts">
          <MenuItem>Pie charts</MenuItem>
          <MenuItem>Line charts</MenuItem>
        </SubMenu>
        <MenuItem>Citas</MenuItem>
        <MenuItem>Servicios</MenuItem>
        <MenuItem>Usuarios</MenuItem>
        <MenuItem>Empleados</MenuItem>
      </Menu>
    </Sidebar>
  );
};

export default SidebarComponent;
