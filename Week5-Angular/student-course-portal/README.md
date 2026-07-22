# Student Course Portal - Angular

## 📌 Project Overview

Student Course Portal is an Angular-based web application developed as part of the **Cognizant Digital Nurture Java Full Stack Engineer (Java FSE) Program - Week 5 Angular Exercises**.

This project demonstrates Angular core concepts including components, data binding, routing, services, HTTP client integration, forms, pipes, and unit testing.

The application provides a simple portal where users can view student details, browse courses, and register students using Angular features.

---

# 🚀 Technologies Used

- Angular
- TypeScript
- HTML5
- CSS3
- RxJS
- Jasmine
- Karma
- JSON
- Git & GitHub

---

# ✨ Features Implemented

## 1. Angular Components

Created reusable Angular components:

- Home Component
- Student Component
- Course Component
- Register Component

Each component handles a specific functionality of the Student Course Portal.

---

# 2. Angular Data Binding

Implemented different types of Angular data binding.

---

## Interpolation

Used to display component data in HTML.

Example:

```html
{{ studentName }}
```

---

## Property Binding

Used to bind component properties with HTML elements.

Example:

```html
<img [src]="imageUrl">
```

---

## Event Binding

Used to handle user actions.

Example:

```html
<button (click)="showMessage()">
  Click Me
</button>
```

---

## Two-Way Data Binding

Implemented using `ngModel`.

Example:

```html
<input type="text" [(ngModel)]="studentName">
```

---

# 3. Angular Routing

Implemented navigation using Angular Router.

Available routes:

| Route | Component |
|---|---|
| / | Home Component |
| /student | Student Component |
| /course | Course Component |
| /register | Register Component |

Navigation menu:

- Home
- Student
- Course
- Register

---

# 4. Angular Directives

Implemented Angular structural directives.

## ngIf

Used for conditional rendering.

Example:

```html
<p *ngIf="showCourses">
  Available Courses
</p>
```

---

## ngFor

Used to display course list dynamically.

Example:

```html
<li *ngFor="let course of courses">
  {{course.name}}
</li>
```

