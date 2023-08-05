fun main() {
	// nested for loops are very useful
    for(i in 1..5) {
		val numberOfSpaces = i - 1
		for(j in 1..numberOfSpaces) {
			print(" ")
		}
		val numberOfStars = 6 - i
		for(j in 1..numberOfStars) {
			print("*")
		}
		println()
	}
    
    // they can be used to repeat a code block for a number of times
    for (i in 1..5) {
val numberOfSpaces = i - 1
for (j in 1..numberOfSpaces) {
     print(" ")
}
val numberOfStars = 11 - i * 2
for (j in 1..numberOfStars) {
      print("*")
}
      println()
}
    
    // with some understanding they can to print different shapes
    for (i in 1 until 5) {
   val numberOfSpaces = 5 - i
for (j in 1..numberOfSpaces) {
   print(" ")
}
val numberOfStars = i
for (j in 1..numberOfStars) {
     print("*")
}
     println()
}
for (i in 1..5) {
val numberOfSpaces = i - 1
for (j in 1..numberOfSpaces) {
      print(" ")
}
val numberOfStars = 6 - i
for (j in 1..numberOfStars) {
     print("*")
}
     println()
}
}