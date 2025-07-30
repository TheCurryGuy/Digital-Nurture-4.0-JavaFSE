import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import MainApplication from './App';
import reportWebVitals from './reportWebVitals';

const applicationRoot = ReactDOM.createRoot(document.getElementById('root'));
applicationRoot.render(
  <React.StrictMode>
    <MainApplication />
  </React.StrictMode>
);

// For performance monitoring, pass a function to track results 
// (example: reportWebVitals(console.log)) or send to analytics endpoint. 
// More info: https://bit.ly/CRA-vitals
reportWebVitals();
