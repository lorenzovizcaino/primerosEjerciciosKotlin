/*
Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
Mostrar un mensaje de error si el número de cifras es mayor.
 */

fun main() {
    var num:Int=-1

    while(num<0){
        println("Introduce un numero entre 0-999")
        num = readln().toInt()
    }

    var numcifras:Int=num.toString().length
    when(numcifras){
        1-> println("El numero tiene una cifra")
        2-> println("El numero tiene 2 cifras")
        3-> println("El numero tiene 3 cifras")
        else -> println("ERROR, el numero es mayor de 3 cifras")
    }


}