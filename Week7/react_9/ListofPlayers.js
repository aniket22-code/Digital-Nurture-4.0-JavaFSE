import React from "react";

const ListOfPlayers=()=>{
    const players=[
    {name: "Virat Kohli", score:80},
    {name: "Rohit Sharma", score: 75},
    {name: "Jasprit Bumrah", score: 90},
    {name: "Ravindra Jadeja", score: 55},
    {name: "KL Rahul", score: 80},
    {name: "Hardik Pandya", score: 45},
    {name: "Shreyas Iyer", score: 40},
    {name: "Rishabh Pant", score: 95},
    {name: "Bhuvneshwar Kumar", score: 30},
    {name: "Mohammed Shami", score: 75},
    {name: "Yuzvendra Chahal", score: 20},
];

const lowScorePlayers = players.filter(player => player.score < 70);
return (
    <div>
      <h2 style={{ fontSize: '24px', fontWeight: 'bold', marginBottom: '20px' }}>List of Players</h2>
      <ul style={{ listStyleType: 'disc', paddingLeft: '20px', marginBottom: '30px' }}>
        {players.map((player, index) => (
          <li key={index} style={{ marginBottom: '5px' }}>
            Mr. {player.name} {player.score}
          </li>
        ))}
      </ul>
      
      <h2 style={{ fontSize: '24px', fontWeight: 'bold', marginBottom: '20px' }}>List of Players having Scores Less than 70</h2>
      <ul style={{ listStyleType: 'disc', paddingLeft: '20px' }}>
        {lowScorePlayers.map((player, index) => (
          <li key={index} style={{ marginBottom: '5px' }}>
            Mr. {player.name} {player.score}
          </li>
        ))}
      </ul>
    </div>
  );

};

export default ListOfPlayers;