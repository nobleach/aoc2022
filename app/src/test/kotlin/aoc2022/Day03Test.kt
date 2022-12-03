package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day03Test {
    @Test fun itGetsPrioritySum() {
        val input = """
            |vJrwpWtwJgWrhcsFMMfFFhFp
            |jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
            |PmmdzqPrVvPwwTWBwg
            |wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
            |ttgJtRGJQctTZtZT
            |CrZsJsPPZsGzwwsLwLmpwMDw
        """

        val expected = 157
        val day03 = Day03()
        val actual = day03.getPrioritySum(input)

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }

    @Test fun itGetsBadgeSum() {
        val input = """
            |vJrwpWtwJgWrhcsFMMfFFhFp
            |jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
            |PmmdzqPrVvPwwTWBwg
            |wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
            |ttgJtRGJQctTZtZT
            |CrZsJsPPZsGzwwsLwLmpwMDw
        """

        val expected = 70
        val day03 = Day03()
        val actual = day03.getBadgeSum(input)

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }
}
