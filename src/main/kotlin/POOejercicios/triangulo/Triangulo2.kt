package POOejercicios.triangulo

class Triangulo2 {

    var lado1:Double=0.0
        get() = field
        set(value) {
            field = value
        }
    var lado2:Double=0.0
        get() = field
        set(value) {
            field = value
        }
    var lado3:Double=0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(lado1: Double, lado2: Double, lado3: Double) {
        this.lado1 = lado1
        this.lado2 = lado2
        this.lado3 = lado3
    }

    constructor()

    override fun toString(): String {
        return "Triangulo2(lado1=$lado1, lado2=$lado2, lado3=$lado3)"
    }

    fun ladoMayor(){
        when{
            lado1>lado2 && lado1>lado3 -> println("El lado mayor es el lado 1")
            lado2>lado1 && lado2>lado3 -> println("El lado mayor es el lado 2")
            else -> println("El lado mayor es el lado 3")
        }

    }
    fun equilatero():Boolean{
        return lado1==lado2 && lado2==lado3
    }


}