var accountType: String? = null
var accountBalance = 0
val money = (1..1000).random()

fun generateAccount() {
    while(accountType == null) {
        var userChoice = (1..5).random()
        println("The selected option is: ${userChoice}")
    
        accountType = when(userChoice) {
            1 -> "Debit Account"
            2 -> "Credit Account"
            3 -> "Checking Account"
            else -> null
        }
        
        if(accountType == null) {
            println("You entered an incorrect option, please try again")
        } else {
            println("You have selected ${accountType}")
        }
    }
}

fun generateBalance() {
    if(accountType == "Credit Account") {
        accountBalance = (-100..0).random()
    } else {
        accountBalance = (0..100).random()
    }
}

fun main() {
    println("~~~~~~~~~ Welcome to your Banking App ~~~~~~~~~")
    
    while(accountType == null) {
        println("What type of Account would you like to create? \n")
        println("1. Debit Account")
        println("2. Credit Account")
        println("3. Checking Account")
        println("enter your choice (1, 2 or 3) \n")
    
        generateAccount()
        
    }
    
    generateBalance()
    
    println("Your ${accountType} banlance is ${accountBalance} dollars \n")
    
    var isSystemOpen = true
    
    while(isSystemOpen == true) {
        println("What would you like to do? \n")
        println("1. Check Account Balance")
        println("2. Make a Withdrawal")
        println("3. Make a Deposit")
        println("4. Close the App")
        println("which option do you choose? (1, 2, 3 or 4)\n")
        
        var option = (1..4).random()
        println("The selected option is ${option}")
        when(option) {
            1 -> println("Your account balance is ${accountBalance} dollars")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> isSystemOpen = false
            else -> continue
        }
    }
}

fun withdraw(amount: Int): Int {
        accountBalance -= amount
        println("Amount to be withdrawn is ${money} dollars")
        println("Your remaining balance is ${accountBalance} dollars")
        return amount
    }
    
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
    
    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("Amount to deposit is ${money} dollars")
        println("Your total balance is ${accountBalance} dollars")
        return amount
    }
    
    fun creditDeposit(amount: Int): Int {
        if(accountBalance == 0) {
            println("You dont need to deposit to payoff the account since its already paid off")
            return accountBalance
        } else if(accountBalance + amount > 0) {
            println("Deposit failed! You tried to pay off an account greater than the pay off amount. The checking balance is ${accountBalance} dollars")
            return 0
        } else if(-accountBalance == amount) {
            println("You deposited just enough amount to payoff the account")
            return amount
        } else {
            return deposit(amount)
        }
    }
    
    fun transfer(mode: String) {
        val transferAmount: Int
        when(mode) {
            "withdraw" -> {if(accountType == "Debit") {
                transferAmount = debitWithdraw(money)
            } else {
                transferAmount = withdraw(money)
            } 
            println("You withdrew ${transferAmount} dollars")}
            
            "deposit" -> {if(accountType == "Credit") {
                transferAmount = creditDeposit(money)
            } else {
                transferAmount = deposit(money)
            } 
            println("You deposited ${transferAmount} dollars")}
            else -> return
        }
    }