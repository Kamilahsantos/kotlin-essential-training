package chapter5

fun main(args: Array<String>){
    if(args.any()){
        println("The string = ${args[0]}")
    }

    for (arg in args){
        println(arg)
    }
}