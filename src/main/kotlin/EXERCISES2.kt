open class Product(name: String,quantity: Int){
    var p:Int=-1
    init {
        println("Product name :$name")
        println("Quantity: $quantity")

    }
    constructor(name: String,quantity: Int,p: Int) : this(name,quantity){
        this.p=p
        println("Price :$p per piece")
    }
}
class Laptop(name: String,quantity: Int,price : Int,cpu_n:String,RAM_s:String):Product(name,quantity,price){
    var hdd:String=""
    init{
        println("CPU name:$cpu_n")
        println("RAM_Size:$RAM_s")

    }
    constructor(name: String,quantity:Int,price: Int,cpu_n: String,RAM_s: String,hdd:String):this(name,quantity,price,cpu_n,RAM_s){
        this.hdd=hdd
        println("HDD_Size:$hdd")
        println("---------------")
    }

}

fun main(){
    var l1=Laptop("HP",2,50000,"Core i5","8GB","512")
    var l2=Laptop("ASUS",3,70000,"Core i7","32GB","256")
    var l3=Laptop("DELL",1,50000,"Core i7","8GB","512")
    var l4=Laptop("MAC",1,110000,"Core i5","8GB","256")
    var l5=Laptop("HP",2,45000,"Core i3","4GB","512")
}