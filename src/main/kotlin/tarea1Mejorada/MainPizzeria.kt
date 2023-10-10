package tarea1Mejorada

fun main() {

    val basePizza1=BasePizza("Mediterranea",15.30)
    val aceitunas=Ingredientes("Aceitunas",1.20)
    val brocoli=Ingredientes("Brocoli",0.90)
    val gambas=Ingredientes("Gambas",1.80)
    val salami=Ingredientes("Salami",1.00)
    val listaIngredientes1:MutableList<Ingredientes> = mutableListOf(aceitunas,brocoli,gambas,salami)

    val basePizza2=BasePizza("4 Quesos",12.60)

    val basePizza3=BasePizza("Caprichosa",14.80)
    val anchoas=Ingredientes("Anchoas",1.30)
    val champinhones=Ingredientes("Champiñones",1.70)
    val listaIngredientes2:MutableList<Ingredientes> = mutableListOf(anchoas,champinhones,gambas)




    val pedido1=Pedido(1,basePizza2)
    val pedido2=Pedido(2,basePizza1,listaIngredientes1)
    val pedido3=Pedido(3,basePizza3,listaIngredientes2)
    val lista:MutableList<Pedido> = mutableListOf()
    lista.add(pedido1)
    lista.add(pedido2)
    lista.add(pedido3)


    for (l in lista){
        println("Pedido #${l.numPedido}" )
        println("BASE PIZZA")

        println("\t${l.basePizza.nombreBasePizza}: ${l.basePizza.precio}€")
        if(l.listaIngredientes!=null){
            println("EXTRA INGREDIENTES")

            for (ingredientes in l.listaIngredientes!!){
                println("\t${ingredientes.nombreIngredientes}: ${ingredientes.precio}€")
            }
        }
        println("Total: ${l.Total()}€")
        println()
    }


}