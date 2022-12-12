package day1

import java.io.File
import java.lang.Exception

class CaloriesCounter {

    private val calories = File("/Users/alexander.otto/AdventOfCoding/advent-of-coding/src/main/resources/testData").readLines()

    fun count(): Int {
        val accumulator = mutableListOf<Int>()
        accumulator.add(0, 0)
        val caloriesPerElf = calories.fold(accumulator) { acc, s ->
            if (s.isEmpty()) {
                acc.add(acc.size, 0)
                acc
            } else {
                acc[acc.size - 1] += try {
                    Integer.parseInt(s)
                } catch (e: Exception) {
                    0
                }
                acc
            }
        }

        return caloriesPerElf.max()
    }
}
