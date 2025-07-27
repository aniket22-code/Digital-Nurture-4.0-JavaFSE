import { CalculateScore } from "./components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore 
        Name={"Steve"}
        School={"KVS OFAJ"}
        total={284}
        goal={300} 
      />
    </div>
  );
}

export default App;