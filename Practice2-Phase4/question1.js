// Define a function
function greet(name) {
    return "Hello, " + name + "!";
}

// Create a prototype
function Person(name, age) {
    this.name = name;
    this.age = age;
}

Person.prototype.introduce = function() {
    return "Hi, I'm " + this.name + " and I'm " + this.age + " years old.";
};

// Test the functions and prototypes
console.log(greet("Alice")); // Output: Hello, Alice!
const person1 = new Person("Bob", 30);
console.log(person1.introduce()); // Output: Hi, I'm Bob and I'm 30 years old.
