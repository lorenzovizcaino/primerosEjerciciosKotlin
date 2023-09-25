package ejerciciosMaria_24sep23
/*
Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
imprimir en pantalla la leyenda "Todos los números son menores a diez".
 */
fun main() {
    println("Numero 1")
    val num1:Int= readln().toInt()
    println("Numero 2")
    val num2:Int= readln().toInt()
    println("Numero 3")
    val num3:Int= readln().toInt()

    if(num1<10 && num2<10 && num3<10) println("Menores a 10")
}