package POOejercicios.persona

fun main() {

    var persona1: Persona = Persona("Antonio",48)
    var persona2: Persona = Persona("Remi",47)
    var persona3: Persona = Persona("Marta",13)

    println(persona1.toString())
    println(persona2.toString())
    println(persona3.toString())

    persona1.mayorEdad()
    persona2.mayorEdad()
    persona3.mayorEdad()


}