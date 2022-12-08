package aoc2022

sealed class Node(val name: String, val parent: Directory?) {}

class File(name: String, val size: Int, parent: Directory) : Node(name, parent) {
}

class Directory(name: String, val children: MutableList<Node>, parent: Directory?) : Node(name, parent) {
}

class Day07 {
    fun part01(input: String): Int {
        val MAX_SIZE = 100_000
        val root = Directory("/", mutableListOf(), null)
        var currentNode = root

        input.trimMargin().split("\n")
            .drop(1) // we're already in /
            .forEach {
                with(it) {
                    when {
                        // It's a command
                        startsWith("$ cd") -> {
                            when (it.split(" ").last()) {
                                ".." -> currentNode = currentNode.parent
                                else -> currentNode = currentNode.children.find(child.name == it.split(" ").last()),
                            }
                        }
                        startsWith("$ ls") -> println("listing")
                        startsWith("dir") -> currentNode.children.add(Directory(it.split(" ").last(), mutableListOf(), currentNode))
                    }
                        else -> currentNode.children.add(
                            File(
                                it.split(" ").last(),
                                it.split(" ").first().toInt(),
                                currentNode
                            ))
                    }
                }
                println(root)
                return 3
        }
    }

    /* fun part02(input: String): Int {

    } */
}
