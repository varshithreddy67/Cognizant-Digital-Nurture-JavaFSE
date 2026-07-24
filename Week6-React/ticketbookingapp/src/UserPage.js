import React from "react";

function UserPage(props) {

  return (

    <div>

      <h2>Welcome User</h2>


      <h3>Book Your Ticket</h3>


      <p>Flight: Air India</p>
      <p>From: Delhi</p>
      <p>To: Hyderabad</p>


      <button onClick={props.logout}>
        Logout
      </button>


    </div>

  );

}

export default UserPage;