import { Routes } from '@angular/router';
import { Home } from './home/home';
import { Student } from './student/student';
import { Course } from './course/course';
import { Register } from './register/register';


export const routes: Routes = [

  {
    path: '',
    component: Home
  },

  {
    path: 'student',
    component: Student
  },

  {
    path: 'course',
    component: Course
  },

  {
    path: 'register',
    component: Register
  }

];