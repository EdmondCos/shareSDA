var oldVal = document.getElementById("myID").innerHTML

function changeHTML(){
    var element = document.getElementById("myID")

    if(element.innerHTML === "pitong"){
        element.innerHTML = oldVal
    } else{
        element.innerHTML = "pitong"
    }
}

var button1 = $("#changer")
var button2 = $("#reseter")
var div = $("#myID")

function clickFct1(){
var obj = {color: "yellow", "background-color": "blue"}
div.css(obj)
div.text("new stuff")
}

var nume = $("#myH1")
var height = $("#myH2")
var details = $("#myP")

function clickFct2(){
    $.ajax({
        url: "https://swapi.co/api/people/69/",
        method: "GET",
        success: function(response){
            nume.text(response.name)
            height.text(response.height)
            details.text(response.birth_year + " " + response.gender)
        }
    })
}

button1.click(clickFct1)
button2.click(clickFct2)



console.log(jQuery)
console.log($("#myID"))
console.log($(".cls"))