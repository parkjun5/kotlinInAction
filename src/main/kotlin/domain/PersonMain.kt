package domain

data class Person(
    val name: String,
    val age: Int? = null
)

fun findPerson(persons: List<Person>, name: String): Person {
    return persons.stream()
        .filter {
            it.name == name
        }
        .findAny()
        .orElse(Person(name))
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    val persons = listOf(
        Person("영희"),
        Person("철수", age = 29)
    )

    val oldest = persons.maxBy { it.age ?: 0 }

    println("나이가 가장 많은 사람 $oldest")

    val findPerson = findPerson(persons, "영희")
    println(findPerson)
    val findPerson2 = findPerson(persons, "테 스트")
    println(findPerson2)
    println(oldest.age?.let { max(it, 13) })


}