package POOejercicios.POOherencia

fun main() {

    var persona1 = Persona("Andres",25);
    println(persona1.nombre)
    println(persona1.edad)
    persona1.edad=40
    println(persona1.edad)

    var empleado1=Empleado("Maria",44,7200.00)
    println(empleado1.nombre)
    println(empleado1.edad)
    println(empleado1.sueldo)
    println("${empleado1.nombre} tiene que pagar impuestos?  ${empleado1.impuestos()}")



}