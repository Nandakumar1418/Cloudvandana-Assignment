let line = "This is a sunny day";
let str= line.split(" ");
for(let i=0;i<str.length;i++){
    str[i] = stringReverse(str[i]);
}
function stringReverse(ele){
    return ele.split("").reverse().join("");
}
console.log(str.join(" "))
