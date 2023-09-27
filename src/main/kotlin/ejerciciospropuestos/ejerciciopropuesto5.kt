package ejerciciospropuestos

/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".*/

fun main() {
    println("Nota 1")
    val nota1= readln().toInt()
    println("Nota 2")
    val nota2= readln().toInt()
    println("Nota 3")
    val nota3= readln().toInt()
    val promedio=(nota1+nota2+nota3)/3
    if(promedio>=7) println("Promocionado")

}