import React, { Component } from 'react';
import Greeting from './Greeting';
import LoginButton from './LoginButton';
import LogoutButton from './LogoutButton';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    const { isLoggedIn } = this.state;

    let button;
    if (isLoggedIn) {
      button = <LogoutButton onClick={this.handleLogout} />;
    } else {
      button = <LoginButton onClick={this.handleLogin} />;
    }

    return (
      <div style={{ textAlign: 'center', marginTop: '40px' }}>
        <h1>✈️ Ticket Booking App</h1>
        <Greeting isLoggedIn={isLoggedIn} />
        {button}
      </div>
    );
  }
}

export default App;

