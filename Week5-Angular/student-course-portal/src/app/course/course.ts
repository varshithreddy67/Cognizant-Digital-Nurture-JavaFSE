import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CourseService } from '../services/course.service';
import { CourseFormatPipe } from '../pipes/course-format-pipe';
@Component({
  selector: 'app-course',
  imports: [
    CommonModule,
    FormsModule,
    CourseFormatPipe
  ],
  templateUrl: './course.html',
  styleUrl: './course.css'
})
export class Course {

  studentName = "Varshith";

  showCourses = true;

  courses: any[] = [];

  today = new Date();

  price = 5000;

  constructor(private courseService: CourseService) {}

  ngOnInit() {

    this.courseService.getCourses()
      .subscribe(data => {
        this.courses = data;
      });

  }

}