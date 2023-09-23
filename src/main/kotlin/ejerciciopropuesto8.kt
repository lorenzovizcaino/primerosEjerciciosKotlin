
/*
Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 */

fun main() {
    println("Numero 1")
    var num1:Int= readln().toInt()
    println("Numero 2")
    var num2:Int= readln().toInt()
    println("Numero 3")
    var num3:Int= readln().toInt()
    var mayor:Int=0
    if(num1>num2){
        if(num1>num3){
            mayor=num1
        }else mayor=num3
    }else if(num2>num3){
        mayor=num2
    }else{
        mayor=num3
    }
    println("El numero mayor es $mayor")

}