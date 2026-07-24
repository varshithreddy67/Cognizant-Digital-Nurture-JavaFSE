import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);


  const increment = () => {
    setCount(count + 1);
  };


  const decrement = () => {
    setCount(count - 1);
  };


  const sayHello = () => {
    alert("Hello! Welcome to React Events");
  };


  const welcomeMessage = (message) => {
    alert(message);
  };


  const clickHandler = (event) => {
    alert("I was clicked");
    console.log(event);
  };


  return (

    <div>

      <h1>Event Examples App</h1>


      <h2>Counter: {count}</h2>


      <button
        onClick={() => {
          increment();
          sayHello();
        }}
      >
        Increase
      </button>


      <button onClick={decrement}>
        Decrement
      </button>


      <button
        onClick={() => welcomeMessage("Welcome")}
      >
        Say Welcome
      </button>


      <button onClick={clickHandler}>
        OnPress
      </button>
      <CurrencyConvertor />


    </div>

  );

}

export default App;