package POOejercicios.POOcolaboracion.Banco

class Banco (var nombre: String, var oficina: Int, var clientes: MutableList<Cliente>){



    init {

        println("La oficina $oficina, del banco $nombre ha abierto sus puertas")
    }

    fun DineroEnCaja():Double{
        var total:Double=0.0
        for(i in 0 .. clientes.size-1){
            total+=clientes[i].saldo
        }
        return total
    }
}