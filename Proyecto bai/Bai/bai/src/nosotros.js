import React, { useEffect } from 'react';
import $ from 'jquery'; // Asegúrate de instalar jquery mediante npm install jquery --save
import 'owl.carousel';


function Carousels() {
  useEffect(() => {
    (".owl-carousel1").owlCarousel({
      loop: true,
      center: true,
      margin: 0,
      responsiveClass: true,
      nav: false,
      responsive: {
        0: {
          items: 1,
          nav: false
        },
        680: {
          items: 2,
          nav: false,
          loop: false
        },
        1000: {
          items: 3,
          nav: true
        }
      }
    });
  }, []);

  return (

  <h4>VISION</h4>
  ); // No necesitas renderizar nada para el carrusel
}

export default Carousels;
