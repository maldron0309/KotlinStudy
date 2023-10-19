fun main(args: Array<String>) {
    println(args.contentToString())

    val popcorn = 5
    val hotdog = 7
    /*var customers = 10

    customers = 8
    println(customers)*/

    val customers = 10
    println("There are $customers customers")
    // There are 10 customers

    println("There are ${customers + 1} customers")
    // There are 11 customers

    val name = "Mary"
    val age  = 20

    println("$name is $age years old")
}