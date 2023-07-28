fun main() {
    /* logical operators yield either a true or a false
    they are used for checking or comparing two values */

    println("A" == "A") // true
    println("A" == "B") // false
    println(10 == 10) // true
    println(20 == 10) // false

    println("A" != "A") // false 
    println("A" != "B") // true 
    println(10 != 10) // false 
    println(20 != 10) // true 

    println(10 > 10) // false 
    println(20 > 10) // true 
    println(10 > 20) // false 

    println(10 < 10) // false 
    println(20 < 10) // false 
    println(10 < 20) // true 

    println(10 >= 10) // true 
    println(20 >= 10) // true 
    println(10 >= 20) // false 

    println(10 <= 10) // true 
    println(20 <= 10) // false 
    println(10 <= 20) // true 
}