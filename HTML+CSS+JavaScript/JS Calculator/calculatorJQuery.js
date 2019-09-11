var firstNumber
var secondNumber
var result
var write = $("#chenar")
var operationButton = $("#calcul")

operationButton.click(calculate)

function save(){
	firstNumber = document.getElementById("firstNumber").value
	secondNumber = document.getElementById("secondNumber").value
}

function calculate(){
	var operator = document.getElementById("operations").value
	if(operator == "+"){
		add()
	} else if(operator == "-"){
		minus()
	} else if(operator == "*"){
		multiply()
	} else if(operator == "/"){
		divide()
	} else {
		compareValue()
	}
	
}

function print(){
	write.text("Rezultatul este: " + result)
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
		write.text(firstNumber + " > " + secondNumber)
	} else if(secondNumber > firstNumber) {
		write.text(firstNumber + " < " + secondNumber)
	} else {
		write.text(firstNumber + " = " + secondNumber)
	}
}


