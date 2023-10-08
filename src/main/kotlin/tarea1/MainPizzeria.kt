package tarea1

fun main() {
    var basePizza1=BasePizza("BasePizza",10.00)
    var ingredientes=Ingredientes("Extra Ingredientes",5.00)
    var pedido1=Pedido(1,basePizza1)
    var pedido2=Pedido(2,basePizza1,ingredientes)
    var lista:MutableList<Pedido> = mutableListOf()
    lista.add(pedido1)
    lista.add(pedido2)


    for (l in lista){
        println("Pedido #${l.numPedido}" )
        println("BasePizza: ${l.basePizza.precio}")
        if(l.ingredientes!=null){
            println("Extra Ingredientes: ${ingredientes.precio}")
        }
        println("Total: ${l.Total()}")
        println()
    }


}