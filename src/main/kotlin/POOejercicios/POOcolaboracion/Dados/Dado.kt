package POOejercicios.POOcolaboracion.Dados

import kotlin.random.Random

/*
Plantear un programa que permita jugar a los dados. Las reglas de juego son:

se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió".
Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Dado y la clase JuegoDeDados.
 */
class Dado (){
    var valor:Int=0

    fun TirarDado():Int{
        valor= Random.nextInt(1,7)
        //valor= ((Math.random()*6)+1).toInt()
        return valor
    }


}