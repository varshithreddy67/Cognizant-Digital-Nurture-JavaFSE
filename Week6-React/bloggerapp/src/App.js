import React, { useState } from "react";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";


function App() {


  const [option, setOption] = useState("book");


  return (

    <div>

      <h1>Blogger App</h1>


      <button onClick={() => setOption("book")}>
        Books
      </button>


      <button onClick={() => setOption("blog")}>
        Blogs
      </button>


      <button onClick={() => setOption("course")}>
        Courses
      </button>



      <hr />



      {
        option === "book" &&
        <BookDetails />
      }



      {
        option === "blog" &&
        <BlogDetails />
      }



      {
        option === "course" &&
        <CourseDetails />
      }



    </div>

  );

}


export default App;