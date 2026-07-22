import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'courseFormat'
})
export class CourseFormatPipe implements PipeTransform {

  transform(value: string): string {

    if (!value) {
      return '';
    }

    return value.toUpperCase().replace(' ', '-');

  }

}