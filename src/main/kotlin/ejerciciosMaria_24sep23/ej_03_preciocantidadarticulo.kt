package ejerciciosMaria_24sep23

/*
Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente.
Mostrar lo que debe abonar el comprador.
 */

fun main() {
    println("Precio del articulo:")
    val precioArticulo:Double= readln().toDouble()
    println("Unidades compradas del articulo:")
    val unidadesArticulo:Int= readln().toInt()
    val precioFinal=precioArticulo*unidadesArticulo
    println("El comprador debe abonar la cantidad de $precioFinal euros")
}