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
    var numCuenta:Int=0
    var saldo:Double
    var cuenta:Banco2
    var lista:MutableList<Banco2> = mutableListOf()
    var listaAcreedor:MutableList<Banco2> = mutableListOf()
    var listaDeudor:MutableList<Banco2> = mutableListOf()
    var listaNulo:MutableList<Banco2> = mutableListOf()

    do{
        cuenta=Banco2()
        println("Introduzca numero de cuenta")
        numCuenta= readln().toInt()
        if(numCuenta>=0){
            println("Introduzca saldo para el numero de cuenta: $numCuenta")
            saldo= readln().toDouble()
            cuenta.numeroCuenta=numCuenta
            cuenta.saldo=saldo
            lista.add(cuenta)

            when{
                cuenta.saldo>0 -> {
                    println("Cuenta añadida a la lista de Acreedor")
                    listaAcreedor.add(cuenta)
                }
                cuenta.saldo<0 -> {
                    println("Cuenta añadida a la lista de Deudor")
                    listaDeudor.add(cuenta)
                }
                else -> {
                    println("Cuenta añadida a la lista de Nulos")
                    listaNulo.add(cuenta)
                }
            }

        }
    }while (numCuenta>=0)

    println("LISTADO DE CLIENTES")
    println("\nListado de Acreedor")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. listaAcreedor.size-1) println("\t${listaAcreedor[i].numeroCuenta}\t\t\t\t\t${listaAcreedor[i].saldo}")

    println("\nListado de Deudor")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. listaDeudor.size-1) println("\t${listaDeudor[i].numeroCuenta}\t\t\t\t\t${listaDeudor[i].saldo}")

    println("\nListado de Nulo")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. listaNulo.size-1) println("\t${listaNulo[i].numeroCuenta}\t\t\t\t\t${listaNulo[i].saldo}")

    println("\nListado de Todos")
    println("Numero de cuenta\t Saldo en cuenta")
    for (i in 0 .. lista.size-1) println("\t${lista[i].numeroCuenta}\t\t\t\t\t${lista[i].saldo}")


}