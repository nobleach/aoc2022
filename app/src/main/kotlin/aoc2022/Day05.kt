package aoc2022

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
        // Perform operations
        moves.split("\n").dropLast(1).forEach {
            val (qty, _, src, _, dest) = it.split(" ").drop(1)
            val crates = stacks[src.toInt() - 1].takeLast(qty.toInt())
            repeat(qty.toInt()) {stacks[src.toInt() - 1].removeLast() }
            stacks[dest.toInt() - 1].addAll(crates.reversed())
        }

        return stacks.map {
            it.last()
        }
        .joinToString("")
    }

    fun getResultFromMultiMoves(input: String): String {
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
        // Perform operations
        moves.split("\n").dropLast(1).forEach {
            val (qty, _, src, _, dest) = it.split(" ").drop(1)
            val crates = stacks[src.toInt() - 1].takeLast(qty.toInt())
            repeat(qty.toInt()) {stacks[src.toInt() - 1].removeLast() }
            stacks[dest.toInt() - 1].addAll(crates)
        }

        return stacks.map {
            it.last()
        }
        .joinToString("")
    }
}
