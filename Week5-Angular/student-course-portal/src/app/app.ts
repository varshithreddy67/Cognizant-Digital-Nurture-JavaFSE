import { Component } from '@angular/core';
import { Course } from './course/course';

@Component({
  selector: 'app-root',
  imports: [Course],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {

}