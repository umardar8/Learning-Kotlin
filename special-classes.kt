fun main() {

    // data class properties
    val human1 = NormalClass("John", "Human")
    val human2 = NormalClass("John", "Human")

    print("Two classes with same properties: ")
    println(human1 == human2)
    
    val animal1 = DataClass("Garfield", "Cat")
    val animal2 = DataClass("Garfield", "Cat")
    
    print("Two data classes with same properties: ")
    println(animal1 == animal2)
    
    // enum class properties
    println(PaymentOptions.Cash)
    println(PaymentOptions.Card.ordinal)
    for(i in PaymentOptions.values()) {
        println(i)
    }
}

class NormalClass(val name: String, val type: String) { }

// 1. Data Class: allows comparison of classes while providing some options such as
// copying particular values of a class to form a new class. It can also be destructured.

data class DataClass(val name: String, val type: String) { }

// 2. Enum Class: Used in cases where we need to provide some set of options
// it eliminates the risk of typing mistakes by providing predefined list of options

enum class PaymentOptions {
    Cash,
    Card,
    Cheque
}

// commonly used with a function of "when" to provide functionality

fun pay(amount: Int, method: PaymentOptions) {
    when(method) {
        PaymentOptions.Cash -> true // or payWithCash(amount)
        PaymentOptions.Card -> true // or payWithCard(amount)
        PaymentOptions.Cheque -> true // or payWithCheque(amount)
    }
}