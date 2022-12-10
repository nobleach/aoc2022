package aoc2022

class Day10 {
    fun part01(input: String): Int {
        var x = 1
        var cycle = 1
        val waveSeq = mutableListOf<Int>()

        input
            .trimMargin()
            .split("\n")
            .forEach {
                waveSeq.add(x)
                cycle += 1

                when(it) {
                    "noop" -> {}
                    else -> {
                        waveSeq.add(x)
                        cycle += 1

                        val (_, operand) = it.split(" ")

                        x += operand.toInt()
                    }
                }
            }

        return setOf(20, 60, 100, 140, 180, 220).sumOf { waveSeq[it - 1] * it}
    }
}

