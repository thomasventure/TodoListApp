package utils

import java.util.Scanner

object InputUtil  {

    fun input(info: String): String{
        val scanner = Scanner(System.`in`)
        println("$info:")
        val data: String = scanner.nextLine()
        return data
    }
}