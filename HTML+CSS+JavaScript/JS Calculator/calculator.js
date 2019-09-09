var first
var second

function save(){
first = document.getElementById("first").value
second = document.getElementById("second").value
}

function add(){
save()
alert(+first + +second)
}

function minus(){
save()
alert(+first - +second)
}

function multiply(){
save()
alert(+first * +second)
}

function divide(){
save()
alert(+first / +second)
}