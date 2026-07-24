import React from "react";

function GuestPage(props) {

  return (

    <div>

      <h2>Welcome Guest</h2>

      <h3>Flight Details</h3>

      <p>Flight: Air India</p>
      <p>From: Delhi</p>
      <p>To: Hyderabad</p>


      <button onClick={props.login}>
        Login
      </button>


    </div>

  );

}

export default GuestPage;