fun main() {
    // arithmatic operations follow the rule of precedence (BODMAS Rule)
    println(123 + 456 * 789)

    // expressions with and without parenthesis
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    
    // if you conduct an operation between Int and Long, the result is Long.
	val a = 1 + 2L // the type of a is Long
    println(a)
    
    // if you conduct an operation between Float and Double, the result is Double.
    val b = 1 + 2.0 // the type of b is Double
    println(b)
    
    /* if you conduct operations between a decimal type and either an integer 
       or a decimal type, the result is the decimal type. */
    val c = 1.0F + 2 // the type of c is Float 
    val d = 1.0F + 2.0 // the type of c is Double 
    println(c)
    println(d)

}