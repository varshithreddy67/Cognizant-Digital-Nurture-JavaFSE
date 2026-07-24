import React from 'react';
import CohortDetails from './Components/CohortDetails';

function App() {

  const cohorts = [
    {
      name: "React Batch 2026",
      startedOn: "10-Jul-2026",
      status: "ongoing",
      coach: "Rahul",
      trainer: "Amit"
    },
    {
      name: "Angular Batch 2026",
      startedOn: "05-May-2026",
      status: "completed",
      coach: "Sneha",
      trainer: "Kiran"
    },
    {
      name: "Java FSE Batch",
      startedOn: "20-Jun-2026",
      status: "ongoing",
      coach: "Vikram",
      trainer: "Ramesh"
    }
  ];

  return (
    <div>
      <h1>Cohort Dashboard</h1>

      {
        cohorts.map((cohort, index) => (
          <CohortDetails
            key={index}
            cohort={cohort}
          />
        ))
      }

    </div>
  );
}

export default App;