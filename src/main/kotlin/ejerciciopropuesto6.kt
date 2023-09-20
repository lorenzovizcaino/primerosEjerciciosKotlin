/*
Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */


fun main() {
    println("Numero")
    val numero= readln().toInt()
    if(numero<10){
        println("El numero tiene una cifra")
    }else if(numero>99){
        println("El numero tiene mas de 2 cifras")
    }else{
        println("El numero tiene 2 cifras")
    }
}