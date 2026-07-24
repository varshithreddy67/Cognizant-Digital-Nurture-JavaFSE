import React, { useContext } from "react";

import "./ThemeButton.css";

import ThemeContext from "./ThemeContext";


function EmployeeCard() {


  const theme = useContext(ThemeContext);


  return (

    <div>

      <h3>Employee Card</h3>


      <p>
        Current Theme: {theme}
      </p>


      <button className={theme}>
        View Details
      </button>


    </div>

  );

}


export default EmployeeCard;