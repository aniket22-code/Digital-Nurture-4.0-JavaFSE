import React, { useState } from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

const App = () => {
  const [flag, setFlag] = useState(true);

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
      <h1>Cricket App</h1>
      
      <div style={{ marginBottom: '20px' }}>
        <button 
          onClick={() => setFlag(true)}
          style={{ 
            marginRight: '10px', 
            padding: '10px 20px',
            backgroundColor: flag ? '#007bff' : '#6c757d',
            color: 'white',
            border: 'none',
            borderRadius: '4px',
            cursor: 'pointer'
          }}
        >
          Show List of Players (Flag = True)
        </button>
        <button 
          onClick={() => setFlag(false)}
          style={{ 
            padding: '10px 20px',
            backgroundColor: !flag ? '#007bff' : '#6c757d',
            color: 'white',
            border: 'none',
            borderRadius: '4px',
            cursor: 'pointer'
          }}
        >
          Show Indian Players (Flag = False)
        </button>
      </div>

      <div style={{ 
        border: '1px solid #ddd', 
        borderRadius: '8px', 
        padding: '20px',
        backgroundColor: '#f8f9fa'
      }}>
        {flag ? <ListofPlayers /> : <IndianPlayers />}
      </div>

      
    </div>
  );
};
export default App;