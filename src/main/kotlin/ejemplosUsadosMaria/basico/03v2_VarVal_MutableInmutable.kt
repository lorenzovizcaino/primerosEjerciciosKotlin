package ejemplosUsadosMaria.basico

fun main() {
    //listas Inmutables
    val listVal = listOf(1, 2, 3)
    var listVar = listOf(3, 2, 1)
    //listas mutables
    val mutableListVal = mutableListOf(1, 2, 3)
    var mutableListVar = mutableListOf(1, 2, 3)

    // Las variables inmutables (val) no son reasignables (Val cannot be reassigned):
    //listVal = listOf(4, 5, 6)
    //mutableListVal = mutableListOf(4, 5, 6)
    // mientras que las mutables (var) sí:
    listVar = listOf(4, 5, 6)
    mutableListVar = mutableListOf(4, 5, 6)

    // En tipos inmutables (List) las posiciones internas no pueden cambiar:
    //listVal[0] = 99
    //listVar[0] = 99

    // pero en tipos mutables (MutableList) las posiciones internas sí pueden cambiar:
    mutableListVal[0] = 99
    mutableListVar[0] = 99

}

/*
    # La variable val, var es la que nos indica que ese elemento que se guarda en esa variable es o no reasignable.
    # El tipo mutable o inmutable, indica si lo existente en las posiciones internas de esa estructura es o no modificable.
 */