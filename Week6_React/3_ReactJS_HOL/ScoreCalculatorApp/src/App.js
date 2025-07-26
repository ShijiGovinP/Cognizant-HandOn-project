import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <h1>Student Management Portal</h1>
      <CalculateScore name="Shiji Govin P" school="VMHS School" total={503} goal={6} />
    </div>
  );
}

export default App;
