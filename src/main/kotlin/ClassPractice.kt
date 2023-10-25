

open class Human (val name : String = "Anonymous")  {

    constructor(name : String, age : Int) : this() {
        println("my name is ${name}, ${age}years old")
    }
    init {
        println("New human has been born!~")
    }
    fun eatingCake(){
        println("soooo good")
    }

    open fun singASong(){
        println("lalala~~~")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("라라랄")
        println("my name is ${name}")
    }
}
fun main(){
//    val human = Human("Minsu")

    val mom = Human("Kuri",52)

//    val stranger = Human()
//    human.eatingCake()
//
//    println("this humans name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}