package tarea1

class Pedido (var numPedido:Int, var basePizza: BasePizza, var ingredientes: Ingredientes?){



    constructor(numPedido:Int, basePizza: BasePizza) : this(numPedido,basePizza,null)

    fun Total()= basePizza.precio+ (ingredientes?.precio ?: 0.0)


}