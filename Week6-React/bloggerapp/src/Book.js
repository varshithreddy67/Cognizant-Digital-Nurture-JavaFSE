import React from "react";


function Book(props) {

  return (

    <div>

      <h3>{props.book.name}</h3>

      <p>
        Author: {props.book.author}
      </p>

    </div>

  );

}


export default Book;