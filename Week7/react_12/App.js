import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  const GuestPage = () => (
    <div>
      <h2>Welcome Guest</h2>
      <p>Here are some available flights:</p>
      <ul>
        <li style={{fontWeight:'bold', marginBottom:'10px'}}>Flight 101 - Mumbai to Delhi - 10:00 AM</li>
        <li style={{fontWeight:'bold', marginBottom:'10px'}}>Flight 202 - Bangalore to Hyderabad - 2:00 PM</li>
      </ul>
    </div>
  );

  const UserPage = () => (
    <div>
      <h2>Welcome User</h2>
      <p>You can now book tickets:</p>
      <button style={{fontWeight:'bold', fontSize:'20px'}} onClick={() => alert('Ticket Booked!')}>Book Flight</button>
    </div>
  );

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Ticket Booking App</h1>

      {isLoggedIn ? <UserPage /> : <GuestPage />}

      <div style={{ marginTop: '20px' }}>
        {isLoggedIn ? (
          <button style={{fontWeight:'bold', fontSize:'20px'}} onClick={handleLogout}>Logout</button>
        ) : (
          <button style={{fontWeight:'bold', fontSize:'20px'}} onClick={handleLogin}>Login</button>
        )}
      </div>
    </div>
  );
}

export default App;
