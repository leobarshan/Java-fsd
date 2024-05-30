import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input() childData: string = ''; // Initialize childData property
  @Output() childDataChange: EventEmitter<string> = new EventEmitter<string>();

  onInputChange(newValue: string) {
    this.childData = newValue;
    this.childDataChange.emit(this.childData);
  }
}
