fun main() {
    var er: Double
    var name: String
    var branch: String
    var clas: String
    var batch: String
    var clgName: String
    var uniName: String
    var age: Int

    print("Enter Enrollment Number: ")
    er = readLine().toString().toDouble()
    print("Enter Name: ")
    name = readLine().toString()
    print("Enter Branch: ")
    branch = readln().toString()
    print("Enter Class: ")
    clas = readLine().toString()
    print("Enter Batch: ")
    batch = readLine().toString()
    print("Enter College Name: ")
    clgName = readLine().toString()
    print("Enter University Name: ")
    uniName = readLine().toString()
    print("Enter Your Age: ")
    age = readLine().toString().toInt()

    println("\n********************\n")
    println("Student's Data:")
    println("Enrollment No.: $er")
    println("Name: $name")
    println("Branch: $branch")
    println("Class: $clas")
    println("Batch: $batch")
    println("College Name: $clgName")
    println("University Name: $uniName")
    println("Age: $age")
}