import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // Import FormsModule
import { AppComponent } from './app.component';
import { BindingDemoComponent } from './binding-demo/binding-demo.component';
import { EventDemoComponent } from './event-demo/event-demo.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { MyDirectiveDirective } from './my-directive.directive';
// import { MyCustomPipePipe } from './my-custom-pipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    BindingDemoComponent,
    EventDemoComponent,
    ParentComponent,
    ChildComponent,
    MyDirectiveDirective,
    // MyCustomPipePipe
  ],
  imports: [
    BrowserModule,
    FormsModule // Add FormsModule to imports
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
