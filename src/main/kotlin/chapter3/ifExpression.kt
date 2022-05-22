package chapter3

fun main() {

    val bigger = 101
    val smaller = 1
    val max = if (bigger > smaller) bigger else smaller


    if (bigger > 10) {
        println("Greater than 10!")
    } else if (bigger > 100) {
        println("Greater than 100!")
    } else {
        println("not too big.")
    }
    val number = 121
    val bucket:Any = if (number > 100) {
        "alpha"

    } else if (number > 90) {
        println("less than 90")
        2
    } else if (number > 80) {
        1
    } else {
        0
    }
    println("bucket  = $bucket")
 val isGreater = number > 100

}