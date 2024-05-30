import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'myCustomPipe'
})
export class MyCustomPipe implements PipeTransform {
  transform(value: any, args?: any): any {
    if (typeof value === 'string') {
      return value.toUpperCase(); // Example: Transforming to uppercase
    }
    return value; // Return original value if not a string
  }
}
