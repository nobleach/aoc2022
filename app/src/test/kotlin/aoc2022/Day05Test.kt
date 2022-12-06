package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals
import java.io.File

class Day05Test {
    @Test fun itGetsResultFromMoves() {
        val input = Day05Test::class.java.getResource("/day05_test.txt").readText(Charsets.UTF_8)
        val expected = "CMZ"
        val day05 = Day05()
        val actual = day05.getResultFromMoves(input);

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }

    @Test fun itGetsResultFromMultiMoves() {
        val input = Day05Test::class.java.getResource("/day05_test.txt").readText(Charsets.UTF_8)
        val expected = "MCD"
        val day05 = Day05()
        val actual = day05.getResultFromMultiMoves(input);

        assertEquals(expected, actual, "Expected $expected but got $actual")
    }
}
