fun myFunc(multiplier : Int, lengthLambda: (String) -> Int) {
    val value = lengthLambda.invoke("Hello")
    val final = value * multiplier
    print(final)
}


fun mainx() {
    myFunc (10,
        fun(s: String): Int {
            return s.length
        }
    )

    myFunc (20, { s: String -> s.length })

    myFunc (20) { s: String -> s.length }
}

//---------------------------------

inline fun myFunc2(lengthLambda: (String) -> Int) {
    val final = lengthLambda.invoke("Hello")
    print(final)
}

fun main2() {
    myFunc2 { it.length }
}

// -----------------------------------------

inline fun <reified T> displayValue(value: T) {
    println(value)
    println("Type of T: ${T::class.java}")
}


fun main() {
    displayValue<String>("Generics")
    displayValue<Int>(10)
}