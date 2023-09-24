package ejerciciosMaria_24sep23

/*
Realizar un programa que solicite ingresar dos números enteros distintos y muestre por pantalla el mayor de ellos
 */

fun main() {
    println("Ingrese el primer numero")
    val num1:Int= readln().toInt()
    println("Ingrese el segundo numero")
    val num2:Int= readln().toInt()
    if(num1==num2){
        println("Ha introducido el mismo numero")
    }else if(num1>num2){
        println("El primer numero $num1 es mayor que el segundo numero $num2")
    }else{
        println("El segundo numero $num2 es mayor que el primer numero $num1")

    }

}