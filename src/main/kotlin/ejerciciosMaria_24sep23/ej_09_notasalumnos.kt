package ejerciciosMaria_24sep23

/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a cinco mostrar un mensaje "Apto".*/

fun main() {
    println("Nota 1")
    val nota1= readln().toDouble()
    println("Nota 2")
    val nota2= readln().toDouble()
    println("Nota 3")
    val nota3= readln().toDouble()
    val promedio=(nota1+nota2+nota3)/3
    if(promedio>=5) println("Apto")
    else println("NO Apto")

}