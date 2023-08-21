/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun main() {
    println("Welcome to your Banking System")
    println("What type of Account would you like to create?")
    println("1. Debit Account")
    println("2. Credit Account")
    println("3. Checking Account")
    
    var accountType = ""
    var userChoice = 0
    
    while(accountType == "") {
        println("enter your choice (1, 2 or 3)")
        userChoice = (1..5).random()
        println("The selected option is.. ${userChoice}")
        accountType = when(userChoice) {
            1 -> "Debit Account"
            2 -> "Credit Account"
            3 -> "Checking Account"
            else -> continue
        }
    }
    println("The selected account type is: ${accountType}")
}
