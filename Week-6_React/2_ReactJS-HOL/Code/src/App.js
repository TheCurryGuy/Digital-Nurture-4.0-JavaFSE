import appLogo from './logo.svg';
import './App.css';
import HomeSection from './Components/Home';
import AboutSection from './Components/About';
import ContactSection from './Components/Contact';

function MainApplicationLayout() {
  return (
    <div className="container">
      <HomeSection/>
      <AboutSection/>
      <ContactSection/>
    </div>
  );
}

export default MainApplicationLayout;
