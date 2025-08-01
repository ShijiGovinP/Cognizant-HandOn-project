import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  handleSyntheticEvent = (event) => {
    event.preventDefault(); 
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>Event Examples App</h1>

        <h2>Counter: {this.state.count}</h2>

        <button onClick={this.handleIncrement}>Increment</button>{' '}
        <button onClick={this.decrement}>Decrement</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome!")}>Say Welcome</button>

        <br /><br />

        <button onClick={this.handleSyntheticEvent}>Synthetic Event (OnPress)</button>

        <hr />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;


