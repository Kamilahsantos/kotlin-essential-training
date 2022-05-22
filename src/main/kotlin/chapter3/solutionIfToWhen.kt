package chapter3

fun main() {
    var cardPoints = 7_000

    val cardLevel: String = when(cardPoints) {
        in 0..999 -> "pearl"
        in 1000..4999 -> "silver"
        in 5_000..9999 -> "gold"
        else -> "platinum"
    }

    val addS = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$addS and are at the $cardLevel level.")
}