package aoc2022

class Day08 {
    var curColumn = 1
    var visibleTrees = 0

    fun isVisibleInRow(row: List<Int>, idx: Int): Boolean {
        if (idx == 0) return true
        if (idx == row.lastIndex) return true
        val (front, back) = row
            .withIndex()
            .groupBy {
                it.index > idx
            }
            .map {
                it.value.map {
                    it.value
                }
                .toMutableList()
            }

        val treeHeight = front.removeLast()

        if (front.maxOrNull()!! < treeHeight) return true
        if (back.maxOrNull()!! < treeHeight) return true

        return false
    }

    fun isVisibleInColumn(matrix: List<List<Int>>, columnNumber: Int, idx: Int): Boolean {
        if (columnNumber == 0) return true
        if (columnNumber == matrix.first().lastIndex) return true

        val (front, back) = matrix.map {
            it.get(columnNumber)
        }
        .withIndex()
        .groupBy {
            it.index > idx
        }
        .map {
            it.value.map {
                it.value
            }
            .toMutableList()
        }

        val treeHeight = front.removeLast()

        if (front.maxOrNull()!! < treeHeight) return true
        if (back.maxOrNull()!! < treeHeight) return true

        return false
    }

    fun part01(input: String): Int {
        val matrix = input
            .trimMargin()
            .split("\n")
            .map {
                it.split("")
                    .drop(1) // cleanup?
                    .dropLast(1) // cleanup?
                    .map {
                        it.toInt()
                    }
            }

        val height = matrix.size
        val width = matrix.first().size

        return sequence {
            for (y in 0 until height) {
                for (x in 0 until width) {
                    yield(
                        isVisibleInRow(matrix.get(y), x)
                        || isVisibleInColumn(matrix, x, x)
                    )
                }
            }
        }.count { it }
    }
}
