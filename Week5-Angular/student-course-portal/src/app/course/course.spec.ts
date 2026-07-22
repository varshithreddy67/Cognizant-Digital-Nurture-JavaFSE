import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Course } from './course';
import { CourseService } from '../services/course.service';
import { of } from 'rxjs';

describe('Course', () => {

  let component: Course;
  let fixture: ComponentFixture<Course>;

  let courseServiceMock = {
    getCourses: () => of([
      {
        id: 1,
        name: "Java"
      },
      {
        id: 2,
        name: "Angular"
      }
    ])
  };


  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [Course],

      providers: [
        {
          provide: CourseService,
          useValue: courseServiceMock
        }
      ]

    }).compileComponents();


    fixture = TestBed.createComponent(Course);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });


  it('should create course component', () => {

    expect(component).toBeTruthy();

  });


  it('should load courses', () => {

    expect(component.courses.length)
      .toBe(2);

  });


});