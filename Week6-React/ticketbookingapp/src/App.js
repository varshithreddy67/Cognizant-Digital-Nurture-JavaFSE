import React, { useState } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);


  const login = () => {
    setIsLoggedIn(true);
  };


  const logout = () => {
    setIsLoggedIn(false);
  };


  let page;


  if (isLoggedIn) {

    page = <UserPage logout={logout} />;

  } else {

    page = <GuestPage login={login} />;

  }


  return (

    <div>

      <h1>Ticket Booking App</h1>

      {page}

    </div>

  );

}

export default App;