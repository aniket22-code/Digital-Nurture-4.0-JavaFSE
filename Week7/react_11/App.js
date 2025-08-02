import React, { useState } from 'react';


class utils{
  static sayHello()
{
  alert("hello World");
}}
function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const increment = () => {setCount(count + 1);utils.sayHello()}
  const decrement = () => setCount(count - 1);
  const sayWelcome = () => alert("Welcome to React Application");
  const clickOnMe = () => alert("You clicked me!");

  const handleSubmit = (e) => {
    e.preventDefault();
    let convertedAmount = 0;

    // Simple hardcoded conversion for Euro
    if (currency === "Euro") {
      convertedAmount = parseFloat(amount) * 80;
    }

    alert(`Converting to ${currency} Amount is ${convertedAmount}`);
  };

  return (
    <div style={{ margin: '20px' }}>
      <div style={{fontSize:'20px', fontWeight:'bold'}}>{count}</div><br />
      <button  style={{fontWeight:'bold', marginBottom:'10px', fontSize:'18px'}} onClick={increment}>Increment</button><br />
      <button style={{fontWeight:'bold', marginBottom:'10px', fontSize:'18px'}} onClick={decrement}>Decrement</button><br />
      <button style={{fontWeight:'bold', marginBottom:'10px', fontSize:'18px'}} onClick={sayWelcome}>Say welcome</button><br />
      <button style={{fontWeight:'bold', marginBottom:'10px', fontSize:'18px'}} onClick={clickOnMe}>Click on me</button><br />

      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div>
          <label>Currency: </label>
          <select
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          >
            <option value="Euro">Euro</option>
            {/* Add more currencies here if needed */}
          </select>
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
