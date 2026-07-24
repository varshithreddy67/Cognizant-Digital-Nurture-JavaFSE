import React, { useState } from "react";

import ThemeContext from "./ThemeContext";

import EmployeesList from "./EmployeesList";


function App() {


  const [theme, setTheme] = useState("light");


  return (

    <ThemeContext.Provider value={theme}>

      <div>

        <h1>Employee Management App</h1>


        <button
          onClick={() =>
            setTheme(
              theme === "light" ? "dark" : "light"
            )
          }
        >
          Change Theme
        </button>


        <EmployeesList />


      </div>


    </ThemeContext.Provider>

  );

}


export default App;