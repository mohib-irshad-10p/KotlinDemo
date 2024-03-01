interface Printer {
    fun print()
}

class LaserPrinter(private val toner: Toner) : Printer by toner {
    // LaserPrinter delegates the 'print' function to the 'toner' object
    // This means that when 'print' is called on a LaserPrinter instance,
    // it will delegate the call to the 'print' function of the 'toner' object.

    fun printDocument() {
        println("Printing document...")
        print() // This calls the 'print' function of the 'toner' object
    }
}

class Toner : Printer {
    override fun print() {
        println("Printing with toner...")
    }
}

fun main() {
    val toner = Toner()
    val laserPrinter = LaserPrinter(toner)
    laserPrinter.printDocument()
}
