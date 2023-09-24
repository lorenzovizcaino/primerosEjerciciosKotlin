package ejerciciosMaria_24sep23/*
Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su suma y promedio.

 */

fun main() {
    println("Introduce numero 1")
    val num1= readln().toInt()
    println("Introduce numero 2")
    val num2= readln().toInt()
    println("Introduce numero 3")
    val num3= readln().toInt()
    println("Introduce numero 4")
    val num4= readln().toInt()

    val suma=num1+num2+num3+num4
    val promedio:Double= ((num1+num2+num3+num4).toDouble()/4)
    println("La suma de los numeros es: $suma, y su promedio es: $promedio")
}