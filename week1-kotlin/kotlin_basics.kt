fun main() {

    // VARIABLES
    val language = "Kotlin" //immutable (try to change it will cause error)
    var version = 1.9 //mutable

    println("Language: $language")
    println("Version: $version")

    version = 2.0
    println("Updated Version: $version")
    println()

    // CALL FUNCTIONS
    greetUser("Android Dev")

    print("Input First Number: ")
    var a = readln().toInt()
    print("Input Second Number: ")
    var b = readln().toInt()
    val sum = addNumbers(a, b)
    println("Sum = $sum")

}


// FUNCTION 1
fun greetUser(name: String) {
    println("Hello $name!")
    println()
}


// FUNCTION 2
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}