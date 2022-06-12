package chapter5

import java.io.File

fun main() {
    val result = "src/main/resources"

    val salesFile = File("$result/sales.txt")
    val sales = mutableListOf<Double>()
    salesFile.forEachLine {
        val doubleValue = it.toDoubleOrNull()
        if(doubleValue != null) {
            sales.add(doubleValue)
        }
    }
    sales.forEach{ println(it) }
}
