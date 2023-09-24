package ejerciciosMaria_24sep23

/*
Se ingresan por teclado 2 valores enteros.
Si el primero es menor al segundo calcular la suma y la resta, luego mostrarlos, sino calcular el producto y la división.
 */

fun main() {
    println("Introduce el numero 1:")
    val num1:Int= readln().toInt()
    println("Introduce el numero 2:")
    val num2:Int= readln().toInt()
    if(num1<num2){
        println("La suma de los dos numeros es ${num1+num2}")
        println("La resta de los dos numeros es ${num1-num2}")

    }else{
        println("El producto de los dos numeros es ${num1*num2}")
        println("La division de los dos numeros es ${(num1.toDouble()/num2.toDouble())}")
    }
}