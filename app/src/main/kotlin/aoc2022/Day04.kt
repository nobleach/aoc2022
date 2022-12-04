package aoc2022

class Day04 {
    fun getOverlappingCount(sections: String): Int {
        return sections.trimMargin().split("\n").map {
            val (firstBounds, secondBounds) = it.split(",")
            val (firstLowerBound, firstUpperBound) = firstBounds.split("-")
            val (secondLowerBound, secondUpperBound) = secondBounds.split("-")

            (firstLowerBound.toInt()..firstUpperBound.toInt()).toSet()
                .containsAll(
                    (secondLowerBound.toInt()..secondUpperBound.toInt()).toSet()
                )
                || (secondLowerBound.toInt()..secondUpperBound.toInt()).toSet()
                    .containsAll(
                        (firstLowerBound.toInt()..firstUpperBound.toInt()).toSet()
                    )
        }.filter {
            it
        }.count()
    }

    fun getIntersectinCount(sections: String): Int {
        return sections.trimMargin().split("\n").map {
            val (firstBounds, secondBounds) = it.split(",")
            val (firstLowerBound, firstUpperBound) = firstBounds.split("-")
            val (secondLowerBound, secondUpperBound) = secondBounds.split("-")

            (firstLowerBound.toInt()..firstUpperBound.toInt()).toSet()
                .intersect(
                    (secondLowerBound.toInt()..secondUpperBound.toInt()).toSet()
                )
        }.filter {
            it.size > 0
        }.count()
    }
}
