fun main() {
    var er: Int
    var name: String
    var branch: String
    var clas: String
    var batch: String
    var clgName: String
    var uniName: String
    var age: Int

    println("Enter Enrollment Number: ")
    er = readLine().toString().toInt()
    println("Enter Name: ")
    name = readLine().toString()
    println("Enter Branch: ")
    branch = readln().toString()
    println("Enter Class: ")
    clas = readLine().toString()
    println("Enter Batch: ")
    batch = readLine().toString()
    println("Enter College Name: ")
    clgName = readLine().toString()
    println("Enter University Name: ")
    uniName = readLine().toString()
    println("Enter Your Age: ")
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