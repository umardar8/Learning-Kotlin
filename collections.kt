fun main() {
    // Lists and Mutable Lists
    val myList = listOf("A", "B", "C", "A")
    val myList2 = mutableListOf(1, 2, 3, 2)

    // Sets and Mutable Sets
    val mySet = setOf("a", "b", "c")
    val mySet2 = mutableSetOf(1, 2, 3)

    // Maps and Mutable Maps
    val myMap = mapOf("a" to 1, "b" to 2, "c" to 3)
    val myMap2 = mutableMapOf(Pair(1,"a"), Pair(2,"B"), Pair(3,"d"))

    println(myList)
    println(myList2)
    println(mySet)
    println(mySet2)
    println(myMap)
    println(myMap2)
}