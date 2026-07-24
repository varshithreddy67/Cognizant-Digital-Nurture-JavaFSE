import React from "react";

function App() {

  const officeImage =
    "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800";


  const office = {
    name: "Skyline Office",
    rent: 55000,
    address: "Bangalore"
  };


  // ADD THIS PART
  const officeList = [
    {
      name: "Skyline Office",
      rent: 55000,
      address: "Bangalore"
    },
    {
      name: "Tech Park",
      rent: 75000,
      address: "Hyderabad"
    },
    {
      name: "Business Hub",
      rent: 62000,
      address: "Chennai"
    }
  ];


  return (
    <div>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="500"
      />

      <hr />

      <h2>Office Details</h2>

      <p>
        <b>Name:</b> {office.name}
      </p>

      <p>
        <b>Rent:</b> ₹{office.rent}
      </p>

      <p>
        <b>Address:</b> {office.address}
      </p>


      <hr />

      <h2>All Office Spaces</h2>


      {
  officeList.map((item, index) => (

    <div
      key={index}
      style={{
        border: "1px solid gray",
        margin: "10px",
        padding: "10px"
      }}
    >

      <h3>{item.name}</h3>

      <p
        style={{
          color: item.rent < 60000 ? "red" : "green"
        }}
      >
        Rent: ₹{item.rent}
      </p>

      <p>
        Address: {item.address}
      </p>

    </div>

  ))
}

    </div>
  );

}

export default App;