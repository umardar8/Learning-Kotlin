// in this file, a common way of programming is demonstrated
// in which the object creation for a class can be short handed by
// creating a function that takes argument and create it into an object of a class

fun main() {
    pet(Cat("Tom", "Munchkin"))
    pet(Dog("Brutus", "Bulldog"))

    // both Dog and Cat classes are directly accessible from object of Animal interface
    // thats because these classes are created by implementing the Animal interface
}

interface Animal {
    val breed: String
    fun pet()
}

class Cat(val name: String, override val breed: String): Animal {
    override fun pet() {
        println("Meow")
    }
}

class Dog(val name: String, override val breed: String): Animal {
    override fun pet() {
        println("Woof")
    }
}

// this is the function that shorthands the approach of easily creating objects of a class
fun pet(animal: Animal) {}