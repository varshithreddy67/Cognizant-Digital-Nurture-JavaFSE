import React from "react";

function Warning(props) {

  if (!props.show) {
    return null;
  }


  return (

    <div>
      <h3>Please Login to Book Tickets</h3>
    </div>

  );

}

export default Warning;