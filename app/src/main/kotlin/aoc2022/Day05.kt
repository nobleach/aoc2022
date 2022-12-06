package aoc2022

data class Move(val qty: Int, val source: Int, val destination: Int)

class Day05 {
    fun getResultFromMoves(input: String): String {
        val (stackLayout, moves) = input.split("\n\n")

        val stackLines = stackLayout
            .split("\n")
            .reversed()

        val stackCount = stackLines
            .first()
            .split(" ")
            .filter {
                it.isNotBlank()
            }
            .maxOf {
                it.toInt()
            }

        // create enough stacks
        var stacks = List(stackCount) { ArrayDeque<Char>() }

        // Push crates onto stacks
        stackLines
            .drop(1)
            .forEach {
                it.windowed(3, 4).forEachIndexed {
                    idx, value -> run {
                        if (value[1] != ' ') {
                            stacks[idx].addLast(value[1])
                        }
                    }
                }
            }

        println(stacks)

        return "CMD"
    }
}
