fun main() {
    // kotlin by design, avoids Null Pointer Exception Errors.
    // this is made possible by use of nullable dataTypes and SafeCall feature
    
    var message: String = "Hello" // can not assign null
    var message2: String? = null // can assign null
    
    // Using nulls introduces risks of errors, but you will encounter scenarios 
    // where they are required. Using the appropriate checks will help avoid 
    // errors and ensure that your code will run without issue.
    
    if(message !== null) {
        println(message.length)
    } else {
        println(null)
    }

    // this can also be done by Safe Call feature
    println(message?.length) // prints length of message
    println(message2?.length) // prints null
    
    // another method is to use provide a default value in case a variable is null
    // this can be done with help of elvis operator ?:
    
    val message3: String? = null ?: "Hello World"
    println(message3)

    // last method is using assertion operator !! to forcefull tell the program that a variable is not null
    // however, it is not recommended and should only be used if you are absolutely sure that its not null.

    val message4: String!! = null

}