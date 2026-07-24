import React from "react";


function CourseDetails() {


  const courses = [

    {
      id: 1,
      name: "React Development",
      duration: "60 Hours"
    },

    {
      id: 2,
      name: "Java Programming",
      duration: "40 Hours"
    },

    {
      id: 3,
      name: "Spring Boot",
      duration: "50 Hours"
    }

  ];


  return (

    <div>

      <h2>Course Details</h2>


      {
        courses.map((course) => (

          <div key={course.id}>

            <h3>{course.name}</h3>

            <p>
              Duration: {course.duration}
            </p>

          </div>

        ))
      }


    </div>

  );

}


export default CourseDetails;