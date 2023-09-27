package ejerciciospropuestos/*
Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.
 */

fun main() {
    var etiqueta:String
    println("Ingrese un numero")
    var num:Int= readln().toInt()
    if(num<0){
        etiqueta="Negativo"
    }else if(num>0){
        etiqueta="Positivo"
    }else etiqueta="Nulo"

    println(etiqueta)
}