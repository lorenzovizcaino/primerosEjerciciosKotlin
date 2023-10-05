package POOejercicios.POOcolaboracion.Banco

fun main() {
    var cliente1= Cliente("Antonio","76911388C","Teixugueiras 11",5000.00)
    var cliente2= Cliente("Ana","76451388C","Gran via 311",500.00)
    var cliente3= Cliente("Eva","76911456R","Plaza Compostela 51",15000.00)
    var lista= mutableListOf<Cliente>()
    lista.add(cliente1)
    lista.add(cliente2)
    lista.add(cliente3)

    var banco= Banco("Banco Sabadell",123,lista)
    println(banco.DineroEnCaja())

    cliente1.RetirarDinero(500.00)

    println(banco.DineroEnCaja())

    cliente2.HacerIngreso(1000.00)
    println(banco.DineroEnCaja())


}