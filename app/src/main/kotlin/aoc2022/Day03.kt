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

    fun getBadgeSum(priorityInput: String): Int {
        val cards = priorityInput.trimMargin().split("\n").chunked(3) {
            val (first, second, third) = it
            val symbol = first.toSet().intersect(second.toSet()).intersect(third.toSet()).first()

            if (symbol.isUpperCase()) {
                symbol.code - 38
            } else {
                symbol.code - 96
            }
        }

        return cards.sum()
    }
}
