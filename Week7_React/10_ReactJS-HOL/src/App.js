import React from 'react';
import './App.css';
import officeImage from './oo.jpeg';

function App() {
  const element = "Office Space";
  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const rentClass = ItemName.Rent <= 60000 ? 'textRed' : 'textGreen';

  return (
    <div className="App" style={{ textAlign: 'center' }}>
      <h1>{element} , at Affordable Range</h1>
      <img
        src={officeImage}
        alt="Office Interior"
        width="300px"
        height="300px"
        style={{ marginTop: '20px', borderRadius: '8px' }}
      />
      <h2 style={{ marginTop: '30px' }}>Name: {ItemName.Name}</h2>
      <h3 className={rentClass}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
  


