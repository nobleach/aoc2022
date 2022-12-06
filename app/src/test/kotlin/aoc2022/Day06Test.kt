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
}
