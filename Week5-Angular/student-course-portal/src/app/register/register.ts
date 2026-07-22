import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-register',
  imports: [FormsModule],
  templateUrl: './register.html',
  styleUrl: './register.css'
})
export class Register {

  student = {
    name: '',
    email: '',
    course: ''
  };

  submitForm() {

    alert(
      "Registration Successful\nName: " 
      + this.student.name
    );

  }

}