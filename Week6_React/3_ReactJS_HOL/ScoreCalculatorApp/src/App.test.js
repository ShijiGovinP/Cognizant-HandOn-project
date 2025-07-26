import { render, screen } from '@testing-library/react';
import App from './App';

test('renders student management portal title', () => {
  render(<App />);
  const heading = screen.getByText(/student management portal/i);
  expect(heading).toBeInTheDocument();
});
