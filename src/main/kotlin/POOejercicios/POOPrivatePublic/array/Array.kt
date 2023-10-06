package POOejercicios.POOPrivatePublic.array

import kotlin.Array
import kotlin.random.Random
/*
Desarrollar una clase que defina una propiedad privada de tipo array  de 5 enteros.

En el bloque init llamar a un método privado que cargue valores aleatorios comprendidos entre 0 y 10.
Definir otros tres métodos públicos que muestren el array, el mayor y el menor elemento.
 */
class Array {
    //definicion de in array String de 4 elementos vacio
    private var arrayString:Array<String> = Array(4){""}

    //dos maneras de declar un array vacio de Int
    private var array=IntArray(5)
    private var array2:Array<Int> = Array(5){0}


    init {
        IniciarArray()
    }

    private fun IniciarArray() {

        println(array.size)
        for (i in 0..array.size-1){
            array[i]=Random.nextInt(0,11)
        }
    }

    public fun MostarArray(){

        for (i in 0..array.size-1){
            println("La posicion $i del array es: ${array[i]}")
        }
    }

    public fun MayorDelArray():Int{
        var mayor=0;
        for (num in array){
            if(num>mayor) mayor=num
        }
        return mayor
    }
    public fun MenorDelArray():Int{
        var menor=12
        for(num in array){
            if(num<menor) menor=num
        }
        return menor
    }
}