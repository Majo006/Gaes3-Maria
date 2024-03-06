
import img from './img/img.png';
import img_1 from './img/img_1.png';
// Agrega más importaciones si necesitas más imágenes

import './App.css';
import'./nosotros.js'
import Carousel from './carrusel.js';


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

      </div>


      <div>
      <h1>My Carousel</h1>
      <Carousel />
    </div>

    </div>
  );
}

export default App;
