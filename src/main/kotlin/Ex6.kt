fun main() {

    add(111, 2222, -222)
    sub(111, 2222, -222)
    div(111.0, 2222.0, -222.0)
    mul(111, 2222, -222)

}

fun add(n1: Int, n2: Int, n3: Int) {
    var sum: Int = n1 + n2 + n3
    println("Sum is $sum")
}

fun sub(n1: Int, n2: Int, n3: Int) {
    var sub: Int = n1 - n2 - n3
    println("Subtraction is $sub")
}

fun mul(n1: Int, n2: Int, n3: Int) {
    var mult: Int = n1 * n2 * n3
    println("Multiplication is ${mult}")
}

fun div(n1: Double, n2: Double, n3: Double) {
    var divi: Double = (n1 / n2) / n3
    println("Division is $divi")
}