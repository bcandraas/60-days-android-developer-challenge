fun main() {

    checkNumber(10)
    checkNumber(-2)
    checkNumber(0)

    getDayName(2)

    printNumbers()

    countDown()
}


fun checkNumber(num: Int) {
    if (num > 0) {
        println("Positive")
    } else if (num < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}


fun getDayName(day: Int) {
    when(day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Invalid day")
    }
}


fun printNumbers() {
    for (i in 1..5) {
        println(i)
    }
}


fun countDown() {
    var i = 5
    while (i > 0) {
        println(i)
        i--
    }
}