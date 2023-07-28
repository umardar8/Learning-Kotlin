fun main() {
    // strings in kotlin can be single-lined or multi-lined
    var myString = "Hello, World"
    val myString2 = """ this is string
    from Kotlin
    on Multiple Lines"""

    println(myString)
    println(myString2)

    // strings can be appended (concatenated) by using + symbol
    println(myString + myString2)
    println(myString + " another example of appending string")

    // strings in kotlin can print variables in line with use of $ symbol
    var name = "Umar"
    var age = 21
    println("My name is $name and I am $age years old.")

    // strings have many useful functions which can be used
    println("Check length of a string ${ myString.length }")
    println("Check if string starts with Hel: ${ myString.startsWith("Hel") }")
    println("Check if string ends with rld: ${ myString.endsWith("rld") }")
    println("Check if string equals to Hello, World: ${ myString.equals("Hello, World") }")
    println("Make the string Uppercase: ${ myString.uppercase() }")
    println("Make the string lowercase: ${ myString.lowercase() }")
    println("Print a new string starting from the second word: ${ myString.substring(1) }")

}