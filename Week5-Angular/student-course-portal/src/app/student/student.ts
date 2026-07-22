import { Component } from '@angular/core';

@Component({
  selector: 'app-student',
  imports: [],
  templateUrl: './student.html',
  styleUrl: './student.css',
})
export class Student {

  studentName = "Varshith";
  course = "Java FSE";
  batch = "Cognizant Digital Nurture";

  imageUrl = "angular.gif";

  showMessage() {
    alert("Welcome to Angular Data Binding!");
  }

}