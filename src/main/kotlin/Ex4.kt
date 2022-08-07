fun main() {
    print("Enter a number: ")
    var num: Int = readLine().toString().toInt()
    
    if (num % 2 != 0) {
        println("$num is odd")
    } else {
        println("$num is even")
    }
}