package pertemuan1

fun main(){
    val greet = { name: String -> greetings(name) }
    greet("Anissa Nursafitri")
}

fun greetings(name: String) {
    println("Hallo $name!")
}