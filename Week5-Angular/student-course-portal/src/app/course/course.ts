import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-course',
  imports: [CommonModule, FormsModule],
  templateUrl: './course.html',
  styleUrl: './course.css',
})
export class Course {

  studentName = "Varshith";

  showCourses = true;

  courses = [
    "Java",
    "Angular",
    "Spring Boot",
    "SQL",
    "Git"
  ];

}