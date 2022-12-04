package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day04Test {
    @Test fun itGetsACountOfOverlappingPairs() {
        val input = """
            |2-4,6-8
            |2-3,4-5
            |5-7,7-9
            |2-8,3-7
            |6-6,4-6
            |2-6,4-8
        """

        val expected = 2
        val day04 = Day04()
        val actual = day04.getOverlappingCount(input)

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }
    @Test fun itHandlesEdgeCases() {
        val input = """
            |6-6,6-6
            |26-94,26-94
        """

        val expected = 2
        val day04 = Day04()
        val actual = day04.getOverlappingCount(input)

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }

    @Test fun itGetsACountOfIntersectinPairs() {
        val input = """
            |2-4,6-8
            |2-3,4-5
            |5-7,7-9
            |2-8,3-7
            |6-6,4-6
            |2-6,4-8
        """

        val expected = 4
        val day04 = Day04()
        val actual = day04.getIntersectinCount(input)

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }
}

