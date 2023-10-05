package POOejercicios.POOcolaboracion.Dados

fun main() {
    var dado1=Dado()
    var dado2=Dado()
    var dado3=Dado()
    dado1.TirarDado()
    dado2.TirarDado()
    dado3.TirarDado()
    println(dado1.valor)
    println(dado2.valor)
    println(dado3.valor)

    var juegoDados=JuegoDados(dado1,dado2,dado3)
    if (juegoDados.ComprobarSiHeGanado()) println("HAS GANADO!!!!!!!!!")
    else println("Lo siento, NO HAS GANADO")


}