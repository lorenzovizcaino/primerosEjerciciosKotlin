package tarea1Mejorada

class Pedido (var numPedido:Int, var basePizza: BasePizza, var listaIngredientes: MutableList<Ingredientes>?){



    constructor(numPedido:Int, basePizza: BasePizza) : this(numPedido,basePizza,null)

   // fun Total()= basePizza.precio+ (ingredientes?.precio ?: 0.0)

    fun Total():Double{
        var total=basePizza.precio
        if(listaIngredientes!=null){
            for(lista in listaIngredientes!!){
                total+=lista.precio
            }
        }
        return total
    }


}