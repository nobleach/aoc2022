package aoc2022

class Day06 {
    fun part01(input: String): Int {
       return input
           .windowed(4, 1)
           .map { it.toSet().size }
           .indexOfFirst {
               it == 4
           } + 4
    }

    fun part02(input: String): Int {
       return input
           .windowed(14, 1)
           .map { it.toSet().size }
           .indexOfFirst {
               it == 14
           } + 14
    }
}
