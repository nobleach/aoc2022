package aoc2022

enum class NodeType {
    Dir, File
}

sealed class Node {
    class File {
        val nodeType = NodeType.File
    }

    class Directory {
        val nodeType = NodeType.Dir
        val children = mutableMapOf<String, Node>()
    }
}

class Day07 {
    fun part01(input: String): Int {
        val MAX_SIZE = 100_000
        val dirStack = mutableListOf("/")

        input.splitToSequence("\n")
            .forEach {
                with(it) {
                    when {
                        // It's a command
                        startsWith("$") -> println(it.split(" ").last())
                    }
                }
        }
        return 3
    }

    /* fun part02(input: String): Int {

    } */
}
