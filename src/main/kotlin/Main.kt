package org.example

import java.io.File

fun main() {

    val lines = File("words.txt").readLines()

    for (line in lines) {
        println(line)
    }
}