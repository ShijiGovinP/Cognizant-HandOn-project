import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      inr: '',
      euro: ''
    };
  }

  handleChange = (event) => {
    this.setState({ inr: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const conversionRate = 80; // 1 Euro = 80 INR
    const euroAmount = this.state.inr * conversionRate;
    alert(`Converting to Euro Amount is ${euroAmount}`);
    this.setState({ euro: euroAmount });
  };

  render() {
    return (
      <div>
        <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <label>Amount:</label>{' '}
          <input
            type="number"
            value={this.state.inr}
            onChange={this.handleChange}
          /><br /><br />

          <label>Currency:</label>{' '}
          <select>
            <option>Euro</option>
          </select><br /><br />

          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;

