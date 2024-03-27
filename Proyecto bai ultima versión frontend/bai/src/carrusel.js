import React from 'react';
import Slider from 'react-slick';
import 'slick-carousel/slick/slick.css';
import 'slick-carousel/slick/slick-theme.css';
import './carrusel.css'; // Estilos personalizados si es necesario
import img_1 from './img/img_1.png';
import cabello from './img/cabello.jpeg';
import manicura from './img/manicura.jpg';

const Carrusel = () => {
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 3,
    slidesToScroll: 1,
    autoplay: true, // Movimiento automático
    autoplaySpeed: 2000, // Velocidad de movimiento automático en milisegundos (opcional)
    responsive: [
      {
        breakpoint: 1024,
        settings: {
          slidesToShow: 2,
          slidesToScroll: 1,
          infinite: true,
          dots: true
        }
      },
      {
        breakpoint: 600,
        settings: {
          slidesToShow: 1,
          slidesToScroll: 1,
          initialSlide: 1
        }
      }
    ]
  };

  return (
    <Slider {...settings}>
      <div>
        <img src={img_1} alt="Slide 1" className='salon' />
      </div>
      <div>
        <img src={manicura} alt="Slide 2" className='manicura'/>
      </div>
      <div>
        <img src={cabello} alt="Slide 3" className='cabello'/>
      </div>
      {/* Agrega más divs para más slides */}
    </Slider>
  );
};

export default Carrusel;
