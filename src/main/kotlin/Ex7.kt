fun main() {
    print("Enter a number you want it's factorial: ")
    val n = readLine()!!.toInt()
    println("Factorial using Recursion " + recFact(n))
    println("Factorial using tailrec " + fact(n))
}

fun recFact(n: Int): Int {
    if (n == 1 || n == 0) {
        return 1
    }
    return n * recFact(n - 1)
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1) {
        temp
    } else {
        fact(n - 1, temp * n)
    }
}
