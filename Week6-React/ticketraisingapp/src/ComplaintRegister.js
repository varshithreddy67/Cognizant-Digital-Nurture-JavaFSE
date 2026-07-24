import React, { useState } from "react";


function ComplaintRegister() {


  const [employeeName, setEmployeeName] = useState("");

  const [complaint, setComplaint] = useState("");



  const handleSubmit = (e) => {

    e.preventDefault();


    const referenceNumber =
      "CR" + Math.floor(Math.random() * 1000);


    alert(
      "Complaint Registered Successfully\n\n" +
      "Employee Name: " + employeeName +
      "\nComplaint: " + complaint +
      "\nReference Number: " + referenceNumber
    );


    setEmployeeName("");

    setComplaint("");

  };



  return (

    <div>

      <h2>Complaint Registration</h2>


      <form onSubmit={handleSubmit}>


        <label>
          Employee Name:
        </label>


        <br />


        <input

          type="text"

          value={employeeName}

          onChange={(e) =>
            setEmployeeName(e.target.value)
          }

        />


        <br /><br />



        <label>
          Complaint:
        </label>


        <br />


        <textarea

          value={complaint}

          onChange={(e) =>
            setComplaint(e.target.value)
          }

        />


        <br /><br />



        <button type="submit">
          Submit Complaint
        </button>


      </form>


    </div>

  );

}


export default ComplaintRegister;