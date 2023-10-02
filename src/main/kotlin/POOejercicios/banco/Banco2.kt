package POOejercicios.banco

class Banco2 {

    var numeroCuenta:Int=0
        get() = field
        set(value) {
            field = value
        }


    var saldo:Double=0.0
        get() = field
        set(value) {
            field = value
        }


    constructor(numeroCuenta: Int, saldo: Double) {
        this.numeroCuenta = numeroCuenta
        this.saldo = saldo
    }

    constructor()

    override fun toString(): String {
        return "Banco2(numeroCuenta=$numeroCuenta, saldo=$saldo)"
    }


}