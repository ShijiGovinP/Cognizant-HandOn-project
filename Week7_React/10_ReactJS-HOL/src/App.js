import React from 'react';

function App() {
  // Heading text
  const heading = "Office Space , at Affordable Range";

  // Office details
  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  // Color based on rent
  const rentStyle = {
    color: office.Rent <= 60000 ? 'red' : 'green'
  };

  return (
    <div style={{ textAlign: 'center', padding: '30px', fontFamily: 'Arial' }}>
      {/* Page Heading */}
      <h1 style={{ fontWeight: 'bold' }}>{heading}</h1>

      {/* Office Image */}
      <img
        src="/office.jpeg"
        alt="Office Space"
        width="300"
        height="200"
        style={{ marginTop: '20px' }}
      />

      {/* Office Info */}
      <div style={{ marginTop: '30px', textAlign: 'left', display: 'inline-block' }}>
        <h2>Name: {office.Name}</h2>
        <h3 style={rentStyle}>Rent: Rs. {office.Rent}</h3>
        <h3>Address: {office.Address}</h3>
      </div>
    </div>
  );
}

export default App;


