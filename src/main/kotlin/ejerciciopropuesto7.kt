/*
Cargar un valor entero por teclado comprendido entre 1 y 99.
Almacenar en otra variable la cantidad de dígitos que tiene el valor ingresado por teclado.
Mostrar la cantidad de dígitos del número ingresado por teclado.
 */

fun main() {
    var num: Int = 0
    while (num < 1 || num > 99) {
        println("Dame un numero entre 1 y 99")
        num = readln().toInt()
    }
    var cantidadNumeros:Int=num.toString().length
    println("El numero $num tiene $cantidadNumeros digitos")

}