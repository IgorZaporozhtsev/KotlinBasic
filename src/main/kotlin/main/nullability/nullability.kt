package main.nullability

fun main() {
    val s: String? = "abc"

    if (s != null){
        s.length
    }

    //or

    s?.length




}