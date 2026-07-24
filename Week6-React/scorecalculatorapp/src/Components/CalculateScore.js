import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {

  const name = "Varshith";
  const school = "LPU";
  const total = 500;
  const goal = 5;

  const average = total / goal;

  return (
    <div className="container">
      <h1>Student Score Calculator</h1>

      <h3>Name : {name}</h3>
      <h3>School : {school}</h3>
      <h3>Total Score : {total}</h3>
      <h3>Goal Subjects : {goal}</h3>

      <h2>Average Score : {average}</h2>
    </div>
  );
}

export default CalculateScore;