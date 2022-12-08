package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day08Test {
    @Test fun itSolvesPart1() {
        val input = """
            |30373
            |25512
            |65332
            |33549
            |35390
        """

        val expected = 21
        val day08 = Day08()
        val actual = day08.part01(input)

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }
    // @Test fun itSolvesPart2() {}
}

