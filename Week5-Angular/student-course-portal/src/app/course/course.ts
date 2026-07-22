import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CourseService } from '../services/course.service';

@Component({
  selector: 'app-course',
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './course.html',
  styleUrl: './course.css'
})
export class Course {

  studentName = "Varshith";

  showCourses = true;

  courses: any[] = [];

  constructor(private courseService: CourseService) {}

  ngOnInit() {

    this.courseService.getCourses()
      .subscribe(data => {
        this.courses = data;
      });

  }

}