
fun main(){
//    helloworld()
//    println(add(4,5))

    // 3. String Template

    /*val name = "park"
    val lastname = "jin"
    println("my name is ${name + lastname} I'm 18")

    println("is this true? ${1==0}")

    println("this is 2\$")*/

//    checkNum(1)

//    forAndWhile()
//    nullcheck()
    

}

fun helloworld() : Unit { // void == Unit

    println("Hello World!")
}

// 무언가를 return하려면 return type을 써야한다
// 변수명을 타입보다 먼저 쓴다
fun add(a : Int, b : Int) : Int{

    return a+b
}

// 2. val vs var
// val == value

fun h1(){
    val a : Int = 10 // 상수
    var b : Int = 9

    // a = 10; 안됨
    b = 10

    // 코틀린에서는 타입을 명시하지 않아도 추론 가능
    val c = 10
    var d = 100

    var name = "park"
    
}

// 4. 조건식

fun maxBy(a : Int, b : Int) : Int{

    if (a > b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if (a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("Not bad")
        else -> println("ok")
    }
}

// Expression vs Statement

// 5. Array and List

// Array

// List 1. List 2. MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

// 6. For / while

fun forAndWhile(){

    val students = arrayListOf("park","jason","jenny")

    for (name in students){
        println("${name}")
    }

    for ((index,name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for (i in 1..100){
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10){
        println("current index : ${index}")
        index ++
    }
}

// 7. Nullable / NonNull

fun nullcheck(){
    // NPE : Null Pointer Exception

    var name = "park"

    // ? 넣으면 Nullable 타입이 됨
    var nullName : String? = null

    // kotlin 1.5 부터는 toUpperCase X uppercase O
    var nameInUppperCase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase()

    // ?:

    val lastName : String? = null

    val fullName = name + " " + (lastName?: "NO lastName")
    println(fullName)

    // !! 권장되지 않음
}

fun ignoreNulls(str : String?){
    val mNotNull : String = str!! 
    val upper = mNotNull.uppercase()


    val email : String? = "park@hihi.com"
    email?.let{
        println("my email is ${email}")
    }
}