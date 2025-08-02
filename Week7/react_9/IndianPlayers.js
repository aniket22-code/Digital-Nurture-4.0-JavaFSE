import React from 'react';

const IndianPlayers = () => {

  const team = [
    "Sachin1", "Dhoni2", "Virat3", "Rohit4", 
    "Yuvaraj5", "Raina6", "Jadeja7", "Bumrah8"
  ];


  const [first, second, third, fourth, fifth, sixth, seventh, eighth] = team;
  
  const oddTeamPlayers = [
    { position: "First", name: first },
    { position: "Third", name: third },
    { position: "Fifth", name: fifth }
  ];
  
  const evenTeamPlayers = [
    { position: "Second", name: second },
    { position: "Fourth", name: fourth },
    { position: "Sixth", name: sixth }
  ];


  const T20players = ["First Player", "Second Player", "Third Player"];
  const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];

 
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2 style={{ fontSize: '24px', fontWeight: 'bold', marginBottom: '20px' }}>Odd Players</h2>
      <ul style={{ listStyleType: 'disc', paddingLeft: '20px', marginBottom: '30px' }}>
        {oddTeamPlayers.map((player, index) => (
          <li key={index} style={{ marginBottom: '5px' }}>
            {player.position} : {player.name}
          </li>
        ))}
      </ul>

      <h2 style={{ fontSize: '24px', fontWeight: 'bold', marginBottom: '20px' }}>Even Players</h2>
      <ul style={{ listStyleType: 'disc', paddingLeft: '20px', marginBottom: '30px' }}>
        {evenTeamPlayers.map((player, index) => (
          <li key={index} style={{ marginBottom: '5px' }}>
            {player.position} : {player.name}
          </li>
        ))}
      </ul>

      <h2 style={{ fontSize: '24px', fontWeight: 'bold', marginBottom: '20px' }}>List of Indian Players Merged:</h2>
      <ul style={{ listStyleType: 'disc', paddingLeft: '20px' }}>
        {mergedPlayers.map((player, index) => (
          <li key={index} style={{ marginBottom: '5px' }}>
            Mr. {player}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;