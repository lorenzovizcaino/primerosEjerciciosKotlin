package ejerciciosMaria_24sep23

/*
Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.
 */

fun main() {
    println("Ingresar sueldo")
    val sueldo:Double= readln().toDouble()
    if(sueldo>3000) println("Tiene usted que abonar impuestos")
    else println("No tiene usted la obligacion de abonar impuestos")
}