fun main() {
    var a: Int = 10
    var b: Double = a.toDouble()
    var c: String = "10"
    var d: Int = c.toInt()


    println("Integer Value $a")
    println("Double Value (from Integer) $b")
    println("String Value $c")
    println("Integer Value(from String) $d")

    c = "11.12"
    var e: Double = c.toDouble()
    println("String Value $c")
    println("Double Value(from String) $e")

}