// Maps
let myMap = new Map();

// Adding entries to the map
myMap.set('key1', 'value1');
myMap.set('key2', 'value2');

// Retrieving values from the map
console.log(myMap.get('key1')); // Output: value1

// Deleting an entry from the map
myMap.delete('key2');

// Classes
class Animal {
    constructor(name) {
        this.name = name;
    }

    // Method to display the name of the animal
    display() {
        console.log(`This is ${this.name}`);
    }
}

// Inheriting from the Animal class
class Dog extends Animal {
    constructor(name, breed) {
        super(name);
        this.breed = breed;
    }

    // Overriding the display method
    display() {
        console.log(`This is ${this.name} and it's a ${this.breed}`);
    }
}

// Create instances of the classes
let animal = new Animal('Animal');
let dog = new Dog('Buddy', 'Labrador');

// Call methods on the instances
animal.display(); // Output: This is Animal
dog.display();    // Output: This is Buddy and it's a Labrador
