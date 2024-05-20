// Function to calculate the factorial of a number recursively
function factorial(n) {
    if (n === 0 || n === 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

// Test the factorial function
console.log(factorial(5)); // Output: 120
