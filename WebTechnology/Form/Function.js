function Submit(){
    event.preventDefault();
    let data = document.querySelectorAll("input")
    if(data[0].value==""){
        alert("Enter your FirstName")
    }
    if(data[1].value==""){
        alert("Enter your LasttName")
    }
    console.log(data[3].checked);
    console.log(data[8]);
    if(data[3].checked==fasle && data[4].checked==true && data[5].checked==true){
        alert("Select Gender");
    }
    if(data[6].value==""){
        alert("Enter your Profession")
    }
    if(data[7].value==""){
        alert("Enter your Email")
    }
    if(data[8].value==""){
        alert("Enter your Number")
    }
}
function Reset(){
    console.log("Form Reset");
}