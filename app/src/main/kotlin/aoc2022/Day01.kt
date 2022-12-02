package aoc2022

import java.io.File

class Day01 {
    fun readFileFromResource(fileName: String)
        = javaClass.getResource("/$fileName").readText(Charsets.UTF_8)

    fun findMaxCalories(calorieCounts: String): Int {
        return calorieCounts.split("\n").fold(mutableListOf(0)) {
            acc,
            it -> {
                if (it.isEmpty()) {
                    acc.add(0)
                } else {
                    acc[acc.lastIndex] = acc[acc.lastIndex] + it.toInt()
                }
                acc
            }
        }.max()
    }

    fun readFileLineByLine(fileName: String): List<Int> {
        var acc = 0;
        var calories = mutableListOf<Int>()

        File(fileName).forEachLine {
            if (it.isEmpty()) {
                // we've reached a blank line
                // close off accumulator and add it
                // to the list
                calories.add(acc)

                // reset accumulator
                acc = 0
            } else {
                // add to accumulator
                acc = acc + it.toInt()
            }
        }

        return calories;
    }

    fun getMaxCalories(calories: List<Int>): Int {
        return calories.max()
    }

    fun getTop3CalorieCount(calories: List<Int>): Int {
        return calories.sortedDescending().take(3).sum()
    }
}

