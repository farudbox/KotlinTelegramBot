package org.example

import java.io.File

fun main() {

    val dictionary = mutableMapOf<String, Word>()

    val file = File("words.txt")
    val lines: List<String> = file.readLines()

    for (line in lines) {
        val parts = line.split("|")

        if (parts.size >= 2) {
            val word = parts[0].trim()
            val translate = parts[1].trim()
            val correctAnswersCount = if (parts.size == 3) parts[2].trim().toIntOrNull() ?: 0 else 0

            dictionary[word] = Word(word, translate, correctAnswersCount)
        } else {
            println("Некорректный формат строки: $line")
        }
    }

    for ((_, word) in dictionary) {
        println(word)
    }
}