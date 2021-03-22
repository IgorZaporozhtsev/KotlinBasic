package main.lambda

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.FEMALE)
    )

    val firstName = heroes.first().name
    println("firstName: $firstName")

    val lastName = heroes.last().name
    println("lastName: $lastName")

    val nameEqOrNull = heroes.firstOrNull { it.age == 30 }?.name
    println("nameEqThirtyOrNull: $nameEqOrNull")

    val countOfNotRepeatedAge = heroes.map { it.age }.distinct().size
    println("countOfNotRepeatedAge: $countOfNotRepeatedAge")

    val filterByAgeSize = heroes.filter { it.age < 30 }.size
    println("filterByAgeSize: $filterByAgeSize")

    val partition = heroes.partition { it.age > 30 }
    println("$partition\n")

    val (youngest, oldest) = heroes.partition { it.age > 30 }
    print("youngest: $youngest\n")
    print("oldest: $oldest\n")
    print("youngest.size: ${youngest.size}\n")
    print("oldest.size: ${oldest.size}\n")

    val hasMaxAgeSize = heroes.maxByOrNull { it.age }?.name
    println("hasMaxAgeSize: $hasMaxAgeSize")

    val whetherAllYoungerThenFifty = heroes.all { it.age > 50 }
    println("whetherAllYoungerThenFifty: $whetherAllYoungerThenFifty")
//
    val isAnyFemale = heroes.any { it.gender == Gender.FEMALE }
    println("anyFemale: $isAnyFemale")
}


