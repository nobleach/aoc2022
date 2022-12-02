package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day02Test {
    @Test fun getsTotalScoreFromStrategy() {
        val input = """
            |A Y
            |B X
            |C Z
        """

        val expected = 15;
        val day02 = Day02();
        val actual = day02.getTotalScore(input);

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }

    @Test fun getsTotalScoreFromCorrectStrategy() {
        val input = """
            |A Y
            |B X
            |C Z
        """

        val expected = 12;
        val day02 = Day02();
        val actual = day02.getTotalScoreCorrectly(input);

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }
}
