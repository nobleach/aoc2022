package aoc2022

import kotlin.test.Test
import kotlin.test.assertEquals

class Day07Test {
    @Test fun itSolvesPart1() {
        val input = """
            |$ cd /
            |$ ls
            |dir a
            |14848514 b.txt
            |8504156 c.dat
            |dir d
            |$ cd a
            |$ ls
            |dir e
            |29116 f
            |2557 g
            |62596 h.lst
            |$ cd e
            |$ ls
            |584 i
            |$ cd ..
            |$ cd ..
            |$ cd d
            |$ ls
            |4060174 j
            |8033020 d.log
            |5626152 d.ext
            |7214296 k
        """

        val day07 = Day07()
        val expected = 95437
        val actual = day07.part01(input);

        assertEquals(expected, actual, "Expected $actual to be $expected!")
    }
}

