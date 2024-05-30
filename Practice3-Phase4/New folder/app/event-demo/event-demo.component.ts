import { Component } from '@angular/core';

@Component({
  selector: 'app-event-demo',
  templateUrl: './event-demo.component.html',
  styleUrls: ['./event-demo.component.css']
})
export class EventDemoComponent {
  message: string = '';

  handleClick(): void {
    this.message = 'Button was clicked!';
  }
}
