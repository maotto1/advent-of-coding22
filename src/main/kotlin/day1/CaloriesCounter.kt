package day1

import java.io.File
import java.lang.Exception

class CaloriesCounter {

    private val calories = File("/Users/alexander.otto/AdventOfCoding/advent-of-coding/src/main/resources/testData").readLines()

    private var actualIndex = 0

    fun count(): Int {
        val accumulator = mutableListOf<Int>()
        accumulator.add(0, 0)
        val c = calories.fold(accumulator) { acc, s ->
            if (s.isEmpty()) {
                actualIndex++
                acc.add(actualIndex, 0)
                acc
            } else {
                acc[actualIndex] += try {
                    Integer.parseInt(s)
                } catch (e: Exception) { 0 }
                acc
            }
        }
        val result = c.max()

        return result
    }
}
