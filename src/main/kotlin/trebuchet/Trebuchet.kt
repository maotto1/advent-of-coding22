package trebuchet

import readInput

fun main(args: Array<String>) {
    day1()
}

fun day1() {
    val result = readInput("23-1.txt").fold(0) { acc, input ->
        10 * input.firstDigit() + input.lastDigit() +acc
    }
    println(result)
}

private fun String.firstDigit() = firstOrNull { it.isDigit()}?.digitToInt() ?: 0

private fun String.lastDigit() = lastOrNull { it.isDigit()}?.digitToInt() ?: 0
