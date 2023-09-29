package POOejercicios.triangulo

fun main() {
    var triangulo1:Triangulo=Triangulo(5.0,5.0,5.0)
    var triangulo2:Triangulo=Triangulo(7.10,5.20,3.20)
    var triangulo3:Triangulo= Triangulo()




    println(triangulo1.equilatero())
    println(triangulo2.equilatero())

    println(triangulo1.toString())
    println(triangulo2.toString())
    println(triangulo3.toString())

    print("En el triangulo2 ")
    triangulo2.ladoMayor()



}