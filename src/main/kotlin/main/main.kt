package main
const val question = "life, the universe, and everything"
const val answer = 42

fun main() {

    val joinToString = listOf("1", "2", "3", "4", "5", "6").joinToString()
    println(joinToString)

    val toString = listOf("1", "2", "3", "4", "5", "6").toString()
    println(toString)


    val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

    println(tripleQuotedString)

    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

    fun getPattern(): String = """d{2} $month d{4}"""

    println(getPattern())
}
