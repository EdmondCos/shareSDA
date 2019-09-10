var firstNumber
var secondNumber
var result

function save(){
	firstNumber = document.getElementById("firstNumber").value
	secondNumber = document.getElementById("secondNumber").value
}

function print(){
	document.getElementById("chenar").innerHTML = "Result is: " + result;
}

function add(){
	save()
	result = +firstNumber + +secondNumber
	print()
}

function minus(){
	save()
	result = +firstNumber - +secondNumber
	print()
}

function multiply(){
	save()
	result = +firstNumber * +secondNumber
	print()
}

function divide(){
	save()
	result = +firstNumber / +secondNumber
	print()
}

function compareValue(){
	save()
	
	if(firstNumber > secondNumber){
		document.getElementById("chenar").innerHTML = firstNumber + " > " + secondNumber
	} else if(secondNumber > firstNumber) {
		document.getElementById("chenar").innerHTML = firstNumber + " < " + secondNumber
	} else {
		document.getElementById("chenar").innerHTML = firstNumber + " = " + secondNumber
	}
}
