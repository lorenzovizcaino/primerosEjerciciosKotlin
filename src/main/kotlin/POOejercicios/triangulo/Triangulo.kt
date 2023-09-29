package POOejercicios.triangulo

class Triangulo(private var lado1: Double=0.0, private var lado2: Double=0.0, private var lado3: Double=0.0) {


    fun getLado1():Double{
        return lado1
    }

    fun getLado2():Double{
        return lado2
    }

    fun getLado3():Double{
        return lado3
    }

    fun setLado1(lado1: Double){
        this.lado1=lado1
    }

    fun setLado2(lado2: Double){
        this.lado2=lado2
    }

    fun setLado3(lado3: Double){
        this.lado3=lado3
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

    override fun toString(): String {
        return "Triangulo(lado1=$lado1, lado2=$lado2, lado3=$lado3)"
    }


}