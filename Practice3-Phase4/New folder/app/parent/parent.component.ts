import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {
  parentData: string = 'Initial Parent Data';

  handleChildDataChange(newChildData: string) {
    this.parentData = newChildData;
  }
}
