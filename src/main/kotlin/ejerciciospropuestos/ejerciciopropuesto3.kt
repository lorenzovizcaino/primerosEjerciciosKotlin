package ejerciciospropuestos
/*
Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
 */


fun main() {
    println("Ingrese el primer numero entero")
    val uno= readln().toInt()
    println("Ingrese el segundo numero entero")
    val dos= readln().toInt()
    println("Ingrese el tercer numero entero")
    val tres= readln().toInt()
    println("Ingrese el cuarto numero entero")
    val cuatro= readln().toInt()
    val suma=uno+dos
    val producto=tres*cuatro
    println("La suma de los dos primeros numeros es: $suma")
    println("El producto de los dos ultimos numeros es: $producto")

}