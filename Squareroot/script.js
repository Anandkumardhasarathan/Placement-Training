function calculateSquareRoot() {
    let userInput = document.getElementById("userInput").value;
    let result = parseFloat(userInput);
    let decimalInput = document.getElementById("decimalInput").value;
    let output = Math.sqrt(result);
    if (decimalInput) {
        output = output.toFixed(decimalInput);
    }
    document.getElementById("result").innerText=output;
    document.getElementById("decimalDisplay").innerText=decimalInput;
    document.getElementById("resultDisplay").innerHTML=userInput;
}