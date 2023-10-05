package POOejercicios.POOcolaboracion.Banco
/*
Un banco tiene 3 clientes que pueden hacer depósitos y extracciones.
También el banco requiere que al final del día calcule la cantidad de dinero que hay depositado.
 */
class Cliente (val nombre:String, val dni:String, var direccion:String?, var saldo:Double){

    init {

        println("Bienvenido Señor/a: $nombre")
    }

    fun HacerIngreso(ingreso:Double){
        saldo+=ingreso
    }

    fun RetirarDinero(retirada:Double){
        saldo-=retirada
    }

    override fun toString(): String {
        return "Cliente(nombre='$nombre', dni='$dni', direccion=$direccion, saldo=$saldo)"
    }


}