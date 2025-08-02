import React from 'react';

const OfficeSpaceRentalApp = () => {
  

  const officeSpaces = [
    {
      id: 1,
      name: "Modern Co-working Space",
      rent: 35000,
      address: "456 Tech Park, Bangalore",
      image: "https://images.unsplash.com/photo-1497366216548-37526070297c?w=300&h=200&fit=crop"
    },
    {
      id: 2,
      name: "Executive Office Suite",
      rent: 75000,
      address: "789 Corporate Plaza, Delhi",
      image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=300&h=200&fit=crop"
    },
    {
      id: 3,
      name: "Startup Hub Office",
      rent: 28000,
      address: "321 Innovation Center, Pune",
      image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=300&h=200&fit=crop"
    },
    {
      id: 4,
      name: "Premium Business Center",
      rent: 85000,
      address: "654 Financial District, Mumbai",
      image: "https://images.unsplash.com/photo-1486406146926-c627a92ad1ab?w=300&h=200&fit=crop"
    }
  ];

  
  const getRentColor = (rent) => {
    return rent < 60000 ? 'red' : 'green';
  };

  return (
    <div style={{ 
      fontFamily: 'Arial, sans-serif', 
      padding: '20px',
      backgroundColor: '#f5f5f5',
      minHeight: '100vh'
    }}>
     
      <h1 style={{
        textAlign: 'center',
        color: '#333',
        fontSize: '2.5em',
        marginBottom: '30px',
        textShadow: '2px 2px 4px rgba(0,0,0,0.1)'
      }}>
        Office Space Rental Application
      </h1>

     
      <div style={{
        backgroundColor: 'white',
        padding: '20px',
        borderRadius: '8px',
        boxShadow: '0 2px 10px rgba(0,0,0,0.1)'
      }}>
        <h2 style={{ 
          color: '#2c3e50', 
          borderBottom: '2px solid #3498db', 
          paddingBottom: '10px',
          marginBottom: '20px'
        }}>
          Available Office Spaces
        </h2>
        
        <div style={{
          display: 'grid',
          gridTemplateColumns: 'repeat(auto-fit, minmax(300px, 1fr))',
          gap: '20px'
        }}>
          {officeSpaces.map((space) => (
            <div key={space.id} style={{
              border: '1px solid #ddd',
              borderRadius: '8px',
              padding: '15px',
              backgroundColor: '#fafafa',
              transition: 'transform 0.2s ease',
              cursor: 'pointer'
            }}
            onMouseEnter={(e) => e.target.style.transform = 'translateY(-2px)'}
            onMouseLeave={(e) => e.target.style.transform = 'translateY(0)'}
            >
              
              <img 
                src={space.image} 
                alt={space.name}
                style={{
                  width: '100%',
                  height: '200px',
                  objectFit: 'cover',
                  borderRadius: '6px',
                  marginBottom: '15px'
                }}
              />
              
              <h3 style={{ 
                color: '#2c3e50', 
                margin: '0 0 10px 0',
                fontSize: '1.3em'
              }}>
                {space.name}
              </h3>
              
             
              <p style={{ 
                fontSize: '1.4em', 
                fontWeight: 'bold',
                color: getRentColor(space.rent),
                margin: '10px 0',
                textShadow: '1px 1px 2px rgba(0,0,0,0.1)'
              }}>
                Rent: ₹{space.rent.toLocaleString()}/month
              </p>
              
              <p style={{ 
                color: '#7f8c8d', 
                margin: '10px 0',
                lineHeight: '1.5'
              }}>
                📍 {space.address}
              </p>
              
              <div style={{
                marginTop: '15px',
                padding: '8px 16px',
                backgroundColor: space.rent < 60000 ? '#ffebee' : '#e8f5e8',
                borderRadius: '20px',
                display: 'inline-block',
                fontSize: '0.9em',
                fontWeight: 'bold'
              }}>
               
              </div>
            </div>
          ))}
        </div>
      </div>

      
    </div>
  );
};

export default OfficeSpaceRentalApp;