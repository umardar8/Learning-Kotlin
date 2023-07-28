fun main() {
    // val means immutable variable, the value can not change once assigned
    val name = "Umar"
    println(name)

    // explicitly assigning dataType as String
    val name2: String = "Umar"
    println(name2)

    // var creates a variable whose value can be changed later
    var name3 = "Umar"
    println(name3)
    name3 = "Ali"
    println(name3)

    // Int and Long are dataTypes for whole numbers whereas Long is used for storing large numbers
    var num1: Int = 1234567890
    var num2: Long = 123456789012345678
    println(num1)
    println(num2)

    /* Double and Float are dataTypes of decimal numbers, Double stores 16 decimal places
       whereas Float can store upto 8 decimal places. */
    var num3: Float = 10.12345678f
    var num4: Double = 10.1234567891012345
    println(num3)
    println(num4)
    
}