val student = listOf<Student>(
    Student(223, "John", 140.0),
    Student(548, "Mark", 130.0),
    Student(342, "Natalie", 150.0),
    Student(781, "Sara", 130.0)
)

data class Student(val id: Int, val fullName: String, val grade: Double) { }

fun getStudentById(id: Int): Student {
    return student.find{it.id==id} !!
}

fun searchInStudents(name: String): Student? {
    return student.find{it.fullName.lowercase()==name.lowercase()} !!
}

fun main() {
    print("Please, enter ID of the Student: ")
    val id: Int = readln().toInt()
    println(getStudentById(id))
    print("Please, enter Name of the Student: ")
    val name: String = readln()
    println(searchInStudents(name))
}