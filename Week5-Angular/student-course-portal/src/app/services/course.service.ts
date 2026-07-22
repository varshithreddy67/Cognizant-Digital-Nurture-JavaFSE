import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  constructor() { }

  getCourses() {
    return [
      "Java",
      "Angular",
      "Spring Boot",
      "SQL",
      "Git"
    ];
  }
}