// IIFE (Immediately Invoked Function Expression)
(function() {
    var message = "Hello from inside the IIFE!";
    console.log(message);
})();

// Callback
function fetchData(callback) {
    // Simulate fetching data asynchronously
    setTimeout(function() {
        var data = { name: "John", age: 30 };
        callback(data);
    }, 1000);
}

function processData(data) {
    console.log("Received data:", data);
}

fetchData(processData);

// Closure
function outerFunction() {
    var outerVariable = "I'm from outer function";

    function innerFunction() {
        console.log(outerVariable);
    }

    return innerFunction;
}

var closureFunc = outerFunction();
closureFunc();
