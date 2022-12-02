package aoc2022.utils

import java.io.File

class InputReader {
    companion object {
        fun readFileFromResource(fileName: String)
            = InputReader::class.java.getResource("/$fileName").readText(Charsets.UTF_8)

        fun readFileLineByLine(fileName: String) = File(fileName)
    }
}
