import React from 'react';
import ReactDOM from 'react-dom';
import Dashboard from './Dashboard';

ReactDOM.render(
  <React.StrictMode>
    <Dashboard /> {/* Renderiza tu nueva vista */}
  </React.StrictMode>,
  document.getElementById('dash')
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
