import appLogo from './logo.svg';
import './App.css';
import { ScoreCalculator } from '../src/Components/CalculateScore';

function MainApp() {
  return (
    <div>
      <ScoreCalculator Name={"Steve"} School={"DNV High School"} total={284} goal={3} />
    </div>
  );
}

export default MainApp;
