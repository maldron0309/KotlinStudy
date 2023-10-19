
fun main(array: Array<String>){

    var customers = 10

    // Some customers leave the queue
    customers = 8

    customers = customers + 3 // Ex of add : 11
    customers += 7 // 18
    customers -= 3 // 3
    customers *= 2 // 30
    customers /= 3 // 10

    println(customers) // 10

    // Variable declared without initialization
//    val d: Int
//    // Variable initialized
//    d = 3
//
//    // Variable explicitly typed and initialized
//    val e: String = "hello"

    // Variable can be read because they have been initalized
//    println(d) // 3
//    println(e) // hello


    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

}