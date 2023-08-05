fun main() {
    // use of "when" conditional in Kotlin
    var password = "ABC" 
    when {
        password == "" -> {
    		println("password can not be empty.")
        }
        password.length < 7 -> {
	    	println("password should contain atleast 7 characters")
        }
        else -> {
            println("Nice password!")
        }
    }

    // the braces can be ommited if there is only one statement in branch
    password = "" 
    when {
        password == "" -> println("password can not be empty.")
        password.length < 7 -> println("password should contain atleast 7 characters")
        else -> println("Nice password!")
    }

    // when can also be used as an expression to directly return some value
    password = "ABCDQWERTY" 
    var textToShow = when {
        password == "" -> "password can not be empty."
        password.length < 7 -> "password should contain atleast 7 characters"
        else -> "Nice password!"
    }
    println (textToShow)

    // if the condition to check is given once with when keyword in parenthesis
    // you can use the when conditional as a Switch-Case
    var number = 2 
    textToShow = when (number) {
        1 -> "One" 
        2 -> "Two" 
        3 -> "Three"
        else -> "Try Again!"
    }
    println(textToShow)

    // when conditional branches can contain multiple value to check
    number = 1 // or 2, 3, 4, 5, 6
    when (number) {
        1 -> {
        	println("Missed hit")
        }
        2, 3, 4, 5 -> {
    		 println("Hit with value $number")
        }
        6 -> {
	         println("Critical hit")
        }
  }
}