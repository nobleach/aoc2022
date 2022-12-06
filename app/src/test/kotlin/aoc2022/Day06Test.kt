package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day06Test {
    @Test fun itSolvesPart1() {
        val day06 = Day06()

        assertEquals(7, day06.part01("mjqjpqmgbljsphdztnvjfqwrcgsmlb"), "Expectation did not match!")
        assertEquals(5, day06.part01("bvwbjplbgvbhsrlpgdmjqwftvncz"), "Expectation did not match!")
        assertEquals(6, day06.part01("nppdvjthqldpwncqszvftbrmjlhg"), "Expectation did not match!")
        assertEquals(10, day06.part01("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"), "Expectation did not match!")
        assertEquals(11, day06.part01("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"), "Expectation did not match!")
    }

    @Test fun itSolvesPart2() {
        val day06 = Day06()

        assertEquals(19, day06.part02("mjqjpqmgbljsphdztnvjfqwrcgsmlb"), "Expectation did not match!")
        assertEquals(23, day06.part02("bvwbjplbgvbhsrlpgdmjqwftvncz"), "Expectation did not match!")
        assertEquals(23, day06.part02("nppdvjthqldpwncqszvftbrmjlhg"), "Expectation did not match!")
        assertEquals(29, day06.part02("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"), "Expectation did not match!")
        assertEquals(26, day06.part02("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"), "Expectation did not match!")
    }
}
