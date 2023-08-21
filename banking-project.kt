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
    
    var accountBalance = (1..100).random()
    var checkingBalance = -accountBalance
    val money = (1..1000).random()
    var output = 0
    
    println("Your account banlance is ${accountBalance} dollars")
    
    fun withdraw(amount: Int): Int {
        accountBalance -= amount
        println("Amount to be withdrawn is ${money} dollars")
        println("Your remaining balance is ${accountBalance} dollars")
        return amount
    }
    
    output = withdraw(money)
    println("You withdrew ${output} dollars")
    
    fun debitWithdraw(amount: Int): Int {
        if(accountBalance == 0) {
            println("cannot withdraw, no money available")
            println("the account balance is ${accountBalance} dollars")
            return accountBalance
        } else if(amount > accountBalance) {
            println("cannot withdraw, not enough balance available")
            return 0
        } else {
            accountBalance -= amount
            println("You have withdrawn ${amount} dollars")
            println("Your remaining balance is ${accountBalance} dollars")
            return amount
        }
    }
    
    output = debitWithdraw(money)
    println("You withdrew ${output} dollars")
    
    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("Amount to deposit is ${money} dollars")
        println("Your total balance is ${accountBalance} dollars")
        return amount
    }
    
    output = deposit(money)
    println("You deposited ${output} dollars")
    
    fun creditDeposit(amount: Int): Int {
        if(checkingBalance == 0) {
            println("You dont need to deposit to payoff the account since its already paid off")
            return checkingBalance
        } else if(checkingBalance + amount > 0) {
            println("Deposit failed! You tried to pay off an account greater than the pay off amount. The checking balance is ${accountBalance} dollars")
            return 0
        } else if(-checkingBalance == amount) {
            println("You deposited just enough amount to payoff the account")
            return amount
        } else {
            return deposit(amount)
        }
    }
    
    output = creditDeposit(money)
    println("You deposited ${output} dollars")
}