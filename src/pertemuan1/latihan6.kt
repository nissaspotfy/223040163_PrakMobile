package pertemuan1

fun main(){
    val greet = { name: String -> greetings(name) }
    greet("nissa")
}

fun greetings(name: String) {
    println("Halo $name!")
}