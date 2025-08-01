import React from 'react';

function ListofPlayers({ players }) {
  return (
    <div>
      {players.map((item, index) => (
        <div key={index}>
          <li>Mr. {item.name} <span>({item.score})</span></li>
        </div>
      ))}
    </div>
  );
}

function ScoreBelow70({ players }) {
  const playersBelow70 = players.filter(player => player.score <= 70);
  return (
    <div>
      {playersBelow70.map((item, index) => (
        <div key={index}>
          <li>Mr. {item.name} <span>({item.score})</span></li>
        </div>
      ))}
    </div>
  );
}

export function OddPlayers([first, , third, , fifth]) {
  return (
    <div>
      <li>First: {first}</li>
      <li>Third: {third}</li>
      <li>Fifth: {fifth}</li>
    </div>
  );
}

export function EvenPlayers([ , second, , fourth, , sixth]) {
  return (
    <div>
      <li>Second: {second}</li>
      <li>Fourth: {fourth}</li>
      <li>Sixth: {sixth}</li>
    </div>
  );
}

export function ListofIndianPlayers({ indianPlayers }) {
  return (
    <div>
      {indianPlayers.map((player, index) => (
        <div key={index}>
          <li>Mr. {player}</li>
        </div>
      ))}
    </div>
  );
}

function App() {
  const flag = true; 

  const players = [
    { name: 'Jack', score: 50 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 40 },
    { name: 'Ann', score: 61 },
    { name: 'Elisabeth', score: 61 },
    { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 100 },
    { name: 'Virat', score: 84 },
    { name: 'Jadeja', score: 64 },
    { name: 'Raina', score: 75 },
    { name: 'Rohit', score: 80 }
  ];

  const IndianTeam = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvarajs", "Raina6"];
  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Indian Team</h1>
        <h2>Odd Players</h2>
        {OddPlayers(IndianTeam)}
        <hr />
        <h2>Even Players</h2>
        {EvenPlayers(IndianTeam)}
        <hr />
        <h2>List of Indian Players Merged:</h2>
        <ListofIndianPlayers indianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;
