import React from "react";
import img from './img/img.png';
import ListUsuario from "./vistas/ListUsuario";
import SidebarComponent from "./siderbar";
import FooterComponent from "./components/FooterComponent";

function Dashboard() {
    return (
      <div className="Dashboard">
        <header className="App-header">
          
  
          <img src={img}  className="App-logo" alt="logo"/>
          <nosotros/>
          <SidebarComponent/>
  
        </header>
        <h2>Olga Look</h2>
        <p>La belleza esta tanto dentro como por fuera</p>
        <FooterComponent/>
      </div>
    );
  }
  
  export default Dashboard;