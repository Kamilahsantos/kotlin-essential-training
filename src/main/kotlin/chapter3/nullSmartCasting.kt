package chapter3

data class Person(var firstName: String, var lastName: String)

fun main() {

    val person2: Person? = null

    val greeting : String? = null //"Hello there"

    if(greeting!=null){
        println("Joe says: $greeting")
    }

    println("greeting length = ${greeting?.length}")

    var len = greeting?.length ?:0
    println("Length = $len")

    val badLen =   greeting!!.length

    val safeGreeting: String? = greeting as? String


}