import React from "react";
import Book from "./Book";


function BookDetails() {


  const books = [

    {
      id: 1,
      name: "React Basics",
      author: "Dan Abramov"
    },

    {
      id: 2,
      name: "JavaScript Essentials",
      author: "Brendan Eich"
    },

    {
      id: 3,
      name: "Learning React",
      author: "Facebook Team"
    }

  ];


  return (

    <div>

      <h2>Book Details</h2>


      {
        books.map((book) => (

          <Book 
            key={book.id}
            book={book}
          />

        ))
      }


    </div>

  );

}


export default BookDetails;