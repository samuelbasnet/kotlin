package com.example.ai37asamuel

fun main() {
    //in java
//String name="samuel"
    //in kotlin
//    var name: String = "Samuel"
//    val terms: Boolean = false
//    val weights: Double = 0.0
//    val age: Int = 19
//    println("My name is $name and age is $age")
//    name="not samuel"

//    val age =arrayOf(10,20,30)
//    age[2]=80
//    println(age[2])

//    val age= ArrayList<Int>()
//    age.add(20)
//    val age1= arrayListOf<Int>(10,20,30)
//    for(i in 0 .. 10 step 1)
//        print(i)
//fun calculate(a:Int,b:Int): Int{
//    return a+b
//    }

//    val age1= arrayListOf<Int>(10,20,30)
//    print(age1)


}
fun main(args: Array<String>) {
    var age = arrayOf(1, 2, 3)
    println(age)
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println("*******************************")

    var name = arrayOf("ram", "shyam", "Hari")
    name[1] = "sandis"
    println("The first element of name is " + name[0])
    println("The second element of name is " + name[1])
    println("The third element of name is " + name[2])

    println(name.size)
}

//fun main() {
//    // ✅ Example 1: Using arrayListOf()
//    var age = arrayListOf<Int>(5, 10, 15)
//    age.add(20)                       // Add element at end
//    age.add(index = 3, element = 25)  // Add element at specific index
//    println("After adding elements: $age")
//
//    age.remove(10)                    // Remove element by value
//    age.removeAt(index = 1)           // Remove element by index
//    println("After removing elements: $age")
//
//    println("***************************")
//
//    // ✅ Example 2: Using ArrayList()
//    var age2 = ArrayList<Int>()
//    age2.add(5)
//    age2.add(10)
//    age2.add(15)
//    println("Initial list: $age2")
//
//    age2.remove(10)
//    age2.removeAt(index = 0)
//    println("After removing: $age2")
//}
