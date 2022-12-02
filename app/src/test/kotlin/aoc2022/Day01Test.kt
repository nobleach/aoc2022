package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day01Test {
    @Test fun findHighestCalorieCount() {
        val input = listOf(100, 200, 300)
        val day01 = Day01()

        val expected = 300;
        val actual = day01.getMaxCalories(input)

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }
}
