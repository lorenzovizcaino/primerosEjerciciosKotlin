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
class Banco(private var numeroCuenta:Int=0, private var saldo:Double=0.0) {

    fun setNumeroCuenta(numeroCuenta:Int){
        this.numeroCuenta=numeroCuenta
    }

    fun setSaldo(saldo:Double){
        this.saldo=saldo
    }

    fun getNumeroCuenta():Int{
        return numeroCuenta;
    }

    fun getSaldo():Double{
        return saldo
    }

    override fun toString(): String {
        return "Banco(numeroCuenta=$numeroCuenta, saldo=$saldo)"
    }


}