package POOejercicios.banco

/*
/*
En un banco se procesan datos de las cuentas corrientes de sus clientes.
De cada cuenta corriente se conoce: número de cuenta y saldo actual.
El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.

Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
    a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
      Estado de la cuenta
            'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

    b) La suma total de los saldos acreedores.
 */
 */
fun main() {
    var numeroCuenta:Int=0
    var saldo:Double
    var cuenta:Banco
    var lista:MutableList<Banco> = mutableListOf()
    var listaAcreedor:MutableList<Banco> = mutableListOf()
    var listaDeudor:MutableList<Banco> = mutableListOf()
    var listaNulo:MutableList<Banco> = mutableListOf()

    do{
        cuenta=Banco()
        println("Introduzca numero de cuenta")
        numeroCuenta= readln().toInt()
        if(numeroCuenta>=0){
            println("Introduzca saldo para el numero de cuenta: $numeroCuenta")
            saldo= readln().toDouble()
            cuenta.setNumeroCuenta(numeroCuenta)
            cuenta.setSaldo(saldo)
            lista.add(cuenta)

            when{
                cuenta.getSaldo()>0 -> {
                    println("Cuenta añadida a la lista de Acreedor")
                    listaAcreedor.add(cuenta)
                }
                cuenta.getSaldo()<0 -> {
                    println("Cuenta añadida a la lista de Deudor")
                    listaDeudor.add(cuenta)
                }
                else -> {
                    println("Cuenta añadida a la lista de Nulos")
                    listaNulo.add(cuenta)
                }
            }

        }
    }while (numeroCuenta>=0)

    println("LISTADO DE CLIENTES")
    println("\nListado de Acreedor")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. listaAcreedor.size-1) println("\t${listaAcreedor[i].getNumeroCuenta()}\t\t\t\t\t${listaAcreedor[i].getSaldo()}")

    println("\nListado de Deudor")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. listaDeudor.size-1) println("\t${listaDeudor[i].getNumeroCuenta()}\t\t\t\t\t${listaDeudor[i].getSaldo()}")

    println("\nListado de Nulo")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. listaNulo.size-1) println("\t${listaNulo[i].getNumeroCuenta()}\t\t\t\t\t${listaNulo[i].getSaldo()}")

    println("\nListado de Todos")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. lista.size-1) println("\t${lista[i].getNumeroCuenta()}\t\t\t\t\t${lista[i].getSaldo()}")


}