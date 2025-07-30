import { render, screen } from '@testing-library/react';
import MainApplication from './App';

test('renders learn react link', () => {
  render(<MainApplication />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
