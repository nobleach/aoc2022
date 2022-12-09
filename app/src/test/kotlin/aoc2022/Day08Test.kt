package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day08Test {
    @Test fun itReturnsTrueIfFirstColumn() {
        val input = listOf(
            listOf(3, 0, 3, 7, 3),
            listOf(2, 5, 5, 1, 2),
            listOf(6, 5, 3, 3, 2),
            listOf(3, 4, 5, 4, 9),
            listOf(3, 5, 3, 9, 0),
        )

        val expected = true
        val day08 = Day08()
        val actual = day08.isVisibleInColumn(input, 0, 0)

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }

    @Test fun itReturnsTrueIfLastColumn() {
        val input = listOf(
            listOf(3, 0, 3, 7, 3),
            listOf(2, 5, 5, 1, 2),
            listOf(6, 5, 3, 3, 2),
            listOf(3, 4, 5, 4, 9),
            listOf(3, 5, 3, 9, 0),
        )

        val expected = true
        val day08 = Day08()
        val actual = day08.isVisibleInColumn(input, 4, 1)

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }

    @Test fun itReturnsFalseIfNotVisible() {
        val input = listOf(
            listOf(3, 0, 3, 7, 3),
            listOf(2, 5, 5, 1, 2),
            listOf(6, 5, 3, 3, 2),
            listOf(3, 4, 5, 4, 9),
            listOf(3, 5, 3, 9, 0),
        )

        val expected = false
        val day08 = Day08()
        val actual = day08.isVisibleInColumn(input, 3, 3)

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }

    @Test fun itReturnsTrueIfVisible() {
        val input = listOf(
            listOf(3, 0, 3, 7, 3),
            listOf(2, 5, 5, 1, 2),
            listOf(6, 5, 3, 3, 2),
            listOf(3, 4, 5, 4, 9),
            listOf(3, 5, 3, 9, 0),
        )

        val expected = true
        val day08 = Day08()
        val actual = day08.isVisibleInColumn(input, 2, 1)

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }

    @Test fun itReturnsTrueIfVisibleInRow() {
        val input = listOf(2, 3, 5, 7, 9)

        val expected = true
        val day08 = Day08()
        val actual = day08.isVisibleInRow(input, 2)

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }

    @Test fun itReturnsFalseIfNotVisibleInRow() {
        val input = listOf(2, 7, 5, 7, 9)

        val expected = false
        val day08 = Day08()
        val actual = day08.isVisibleInRow(input, 3)

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }

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

