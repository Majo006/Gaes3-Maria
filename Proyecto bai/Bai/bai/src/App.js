
import img from './img/img.png';
import img_1 from './img/img_1.png';
// Agrega más importaciones si necesitas más imágenes
import './App.css';
import'./nosotros.js'



function App() {
  return (
    <div className="App">
      <header className="App-header">
        

        <img src={img}  className="App-logo" alt="logo"/>
        <nosotros/>

      </header>

      <div className='App-header2'>
        <button className='botonN'>nosotros</button>
        <button className='botonN'>Servicios</button>
        <button className='login'>Inciar sesión</button>
        <button className='registar'>Registrarse</button>

      </div>



    </div>
  );
}

export default App;
