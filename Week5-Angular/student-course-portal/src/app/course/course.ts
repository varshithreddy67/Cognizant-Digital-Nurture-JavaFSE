import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

import { CourseService } from '../services/course.service';

@Component({
  selector: 'app-course',
  imports: [CommonModule, FormsModule],
  templateUrl: './course.html',
  styleUrl: './course.css',
})
export class Course {

  studentName = "Varshith";

  showCourses = true;

  courses: string[] = [];

  constructor(private courseService: CourseService) {
    this.courses = this.courseService.getCourses();
  }

}