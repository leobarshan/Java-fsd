// import { Component } from '@angular/core';
// import { FormBuilder, Validators } from '@angular/forms';

// @Component({
//   selector: 'app-signup',
//   templateUrl: './signup.component.html',
//   styleUrls: ['./signup.component.css']
// })
// export class SignupComponent {
//   signupForm = this.formBuilder.group({
//     username: ['', Validators.required],
//     email: ['', [Validators.required, Validators.email]],
//     password: ['', [Validators.required, Validators.minLength(6)]]
//   });

//   constructor(private formBuilder: FormBuilder) {}

//   onSubmit() {
//     // Handle form submission
//     if (this.signupForm.valid) {
//       // Form is valid, proceed with submission
//       console.log('Form submitted successfully!');
//     } else {
//       // Form is invalid, display error messages
//       console.log('Form has errors. Please correct them.');
//     }
//   }
// }
// Implement validators in the sign-up form component (signup.component.ts)
import { Validators } from '@angular/forms';

this.signupForm = this.formBuilder.group({
  username: ['', Validators.required],
  email: ['', [Validators.required, Validators.email]],
  password: ['', [Validators.required, Validators.minLength(6)]]
});
