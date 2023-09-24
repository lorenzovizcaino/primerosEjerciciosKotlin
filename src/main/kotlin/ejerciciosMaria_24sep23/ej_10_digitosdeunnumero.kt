package ejerciciosMaria_24sep23
/*
Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */


fun main() {
    println("Numero")
    val numero= readln().toInt()
    if(numero<10){
        println("El numero tiene un digito")
    }else if(numero>99){
        println("El numero tiene MAS de dos digitos")
    }else{
        println("El numero tiene dos digitos")
    }
}