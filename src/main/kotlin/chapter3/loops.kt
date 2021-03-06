package chapter3

fun main() {

    for (i in 1..10) {
        println("i = $i")

    }

    val students = listOf("Janet", "Daisy", "Veronica", "Fernanda")
    for (student in students) {
        println("Current student is $student")
    }

    for ((index, student) in students.withIndex()) {
        println("Student #${index + 1} is $student")
    }

    println("while")
    var count = 5
    while (count > 0) {
        println(count)
        count--
    }
    println("do while ")
    do {
        println(count)
        count++
    } while (count<5)

    println("break")
    while (count >0 ){
        if(count %2 ==0) break
        println(count)
        count --
    }
}