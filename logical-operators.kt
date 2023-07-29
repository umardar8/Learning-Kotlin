fun main() {
    /* logical operators yield either a true or a false
    they are used for checking or comparing two values */

    println("A" == "A") // true
    println("A" == "B") // false
    println(10 == 10) // true
    println(20 == 10) // false

    println("A" != "A") // false 
    println("A" != "B") // true 
    println(10 != 10) // false 
    println(20 != 10) // true 

    println(10 > 10) // false 
    println(20 > 10) // true 
    println(10 > 20) // false 

    println(10 < 10) // false 
    println(20 < 10) // false 
    println(10 < 20) // true 

    println(10 >= 10) // true 
    println(20 >= 10) // true 
    println(10 >= 20) // false 

    println(10 <= 10) // true 
    println(20 <= 10) // false 
    println(10 <= 20) // true 

    // use of AND operator: &&
    print(true && true)  // true 
    print(true && false)  // false 
    print(false && true)  // false 
    print(false && false)  // false

    val finishedHomework = false // or true 
    val cleanedRoom = true // or false 
    val canPlayGames = finishedHomework && cleanedRoom 
    println(canPlayGames)

    // use of OR operator: ||
    print(true || true)  // true 
    print(true || false)  // true 
    print(false || true)  // true 
    print(false || false)  // false 

    val carCleaned = false // or true 
    val grassCut = true // or false 
    val canGoToCinema = carCleaned || grassCut 
    println(canGoToCinema)

    // use of NOT operator: !
    println(!true) // false 
    println(!false) // true 

    val isAmazing = true 
    print(!isAmazing) // false 
    
    isBoring = false 
    print(!isBoring) // true 
    
}