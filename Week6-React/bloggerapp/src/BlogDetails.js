import React from "react";


function BlogDetails() {


  const blogs = [

    {
      id: 1,
      title: "React Learning Journey",
      author: "Varshith"
    },

    {
      id: 2,
      title: "JavaScript ES6 Features",
      author: "Developer Team"
    },

    {
      id: 3,
      title: "Understanding JSX",
      author: "React Team"
    }

  ];


  return (

    <div>

      <h2>Blog Details</h2>


      {
        blogs.map((blog) => (

          <div key={blog.id}>

            <h3>{blog.title}</h3>

            <p>
              Author: {blog.author}
            </p>

          </div>

        ))
      }


    </div>

  );

}


export default BlogDetails;