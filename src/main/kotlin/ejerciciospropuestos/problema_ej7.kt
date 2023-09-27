package ejerciciospropuestos/*
Ingresar por teclado un valor entero.
Almacenar en otra variable el cuadrado de dicho número si el valor ingresado es par,
en caso que sea impar guardar el cubo.
Mostrar además un mensaje que indique si se calcula el cuadrado o el cubo.
 */


fun main() {
    println("Ingresa un numero")
    val num= readln().toInt()
    val resultado = if(num%2==0){
        println("Vamos a calcular el cuadrado de $num")
        Math.pow(num.toDouble(),2.0)
    }else{
        println("Vamos a calcular el cubo de $num")
        Math.pow(num.toDouble(),3.0)
    }
    println("que es: $resultado")
}