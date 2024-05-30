import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding-demo',
  templateUrl: './binding-demo.component.html',
  styleUrls: ['./binding-demo.component.css']
})
export class BindingDemoComponent {
  isDisabled: boolean = true;
  isActive: boolean = true;
  bgColor: string = 'lightblue';
}
