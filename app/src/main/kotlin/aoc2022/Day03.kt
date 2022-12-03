package aoc2022

class Day03 {
    fun getPrioritySum(priorityInput: String): Int {
        val ruckSackContentList = priorityInput.trimMargin().split("\n")

        return ruckSackContentList.sumOf {
            var (first, second) = it.toList().map {
                if (it.isUpperCase()) {
                    it.code - 38
                } else {
                    it.code - 96
                }
            }.chunked(it.length / 2)

            first.intersect(second).first<Int>()
        }
    }
}
