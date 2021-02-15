package main.syntax

val name = "Nate";
var greeting: String? = null

fun main(){
//    mainIf1()
    mainIf2()
}

fun mainIf1(){
    if (greeting != null){
        println(greeting)
    } else {
        println("Hi")
    }
    println(name)
}

fun mainIf2(){
    greeting = "Wow"
    val greetingToPrint = if (greeting != null) greeting else "Boom"
    //val greetingToPrint = greeting ?: "Boom" // Wow we can change in this way
    println(greetingToPrint)
}