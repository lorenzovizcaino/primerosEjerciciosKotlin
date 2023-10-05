package POOejercicios.POOcolaboracion.Dados

/*
Plantear un programa que permita jugar a los dados. Las reglas de juego son:

se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió".
Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Dado y la clase JuegoDeDados.
 */
class JuegoDados (var dado1:Dado,var dado2:Dado,var dado3:Dado){


    fun ComprobarSiHeGanado():Boolean{
        return dado1.valor==dado2.valor && dado1.valor==dado3.valor
    }

}