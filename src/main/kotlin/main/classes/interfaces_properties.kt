package main.classes

fun main(){
    val provider = BasicInfoProvider3()
    provider.printDetails(Person8())
}

interface PersonInfoProvider3{

    //properties
    val providerInfo: String

    fun printDetails(person: Person8) {
        println(providerInfo)
        person.printInfo()
    }
}

class BasicInfoProvider3 : PersonInfoProvider3 {
    override val providerInfo: String
    get() = "Basic Info provider"
}
