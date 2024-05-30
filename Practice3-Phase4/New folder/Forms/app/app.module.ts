import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms'; // Import ReactiveFormsModule
import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component'; // Import SignupComponent

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent // Add SignupComponent to declarations
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule // Add ReactiveFormsModule to imports
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
