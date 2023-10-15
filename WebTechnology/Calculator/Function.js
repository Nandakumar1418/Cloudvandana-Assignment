let UserInput= document.querySelector("input");

let expression = "";

function calc(num){
    expression = expression + num;
    UserInput.value = expression;
}

function erase(){
    expression = "";  
    UserInput.value = expression;
}

function Equal(){
    UserInput.value = eval(expression);
    expression = ""; 
}

