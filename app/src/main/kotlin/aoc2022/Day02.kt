package aoc2022

class Day02 {
    // A = Rock     X = Rock     1 = Rock
    // B = Paper    Y = Paper    2 = Paper
    // C = Scissors Z = Scissors 3 = Scissors
    //
    // Scoring:
    //     0 = Loss 3 = Tie 6 = Win

    fun getTotalScore(guideInput: String): Int {
        val outcomes = mapOf(
            Pair('A', 'Z') to 0,
            Pair('B', 'X') to 0,
            Pair('C', 'Y') to 0,
            Pair('A', 'X') to 3,
            Pair('B', 'Y') to 3,
            Pair('C', 'Z') to 3,
            Pair('A', 'Y') to 6,
            Pair('B', 'Z') to 6,
            Pair('C', 'X') to 6,
        )

        val playValues = mapOf(
            'X' to 1,
            'Y' to 2,
            'Z' to 3,
        )

        return guideInput.trimMargin().split("\n").map {
            Pair( it.first(), it.last())
        }.fold(0) {
            acc,
            curr -> run {
                acc + outcomes.getValue(curr) + playValues.getValue(curr.second)
            }
        }
    }

    fun getTotalScoreCorrectly(guideInput: String): Int {
        // A = Rock     X = Rock     1 = Rock
        // B = Paper    Y = Paper    2 = Paper
        // C = Scissors Z = Scissors 3 = Scissors
        val howToWin = mapOf(
            'A' to 'Y',
            'B' to 'Z',
            'C' to 'X',
        )

        val howToTie = mapOf(
            'A' to 'X',
            'B' to 'Y',
            'C' to 'Z',
        )

        val howToLose = mapOf(
            'A' to 'Z',
            'B' to 'X',
            'C' to 'Y',
        )

        val playValues = mapOf(
            'X' to 1,
            'Y' to 2,
            'Z' to 3,
        )

        return guideInput.trimMargin().split("\n").map {
            Pair( it.first(), it.last())
        }.fold(0) {
            acc,
            curr -> run {
                when (curr.second) {
                    'X' -> acc + 0 + playValues.getValue(howToLose.getValue(curr.first))
                    'Y' -> acc + 3 + playValues.getValue(howToTie.getValue(curr.first))
                    'Z' -> acc + 6 + playValues.getValue(howToWin.getValue(curr.first))
                    else -> 0
                }
            }
        }

    }
}
