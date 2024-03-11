import React from "react";
import img from './img/img.png';
import ListUsuario from "./vistas/ListUsuario";
import SidebarComponent from "./siderbar";

function Dashboard() {
    return (
      <div className="Dashboard">
        <header className="App-header">
          
  
          <img src={img}  className="App-logo" alt="logo"/>
          <nosotros/>
  
        </header>
        <ListUsuario/>
  
        <Sidebar/>
  
  
      </div>
    );
  }
  
  export default Dashboard;