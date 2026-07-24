import React, { useState } from "react";


function Register() {


  const [name, setName] = useState("");

  const [email, setEmail] = useState("");

  const [password, setPassword] = useState("");

  const [message, setMessage] = useState("");



  const handleSubmit = (e) => {

    e.preventDefault();


    if (name.length < 5) {

      setMessage("Name should have atleast 5 characters");

    }

    else if (!email.includes("@") || !email.includes(".")) {

      setMessage("Enter valid email address");

    }

    else if (password.length < 8) {

      setMessage("Password should have atleast 8 characters");

    }

    else {

      setMessage("Registration Successful");

    }

  };



  return (

    <div>

      <h2>User Registration</h2>


      <form onSubmit={handleSubmit}>


        <label>
          Name:
        </label>

        <br />

        <input

          type="text"

          value={name}

          onChange={(e) =>
            setName(e.target.value)
          }

        />


        <br /><br />



        <label>
          Email:
        </label>

        <br />


        <input

          type="email"

          value={email}

          onChange={(e) =>
            setEmail(e.target.value)
          }

        />


        <br /><br />



        <label>
          Password:
        </label>

        <br />


        <input

          type="password"

          value={password}

          onChange={(e) =>
            setPassword(e.target.value)
          }

        />


        <br /><br />



        <button type="submit">
          Register
        </button>


      </form>


      <h3>{message}</h3>


    </div>

  );

}


export default Register;