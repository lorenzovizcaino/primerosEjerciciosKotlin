package POOejercicios.POOcolaboracion.Club

/*
Plantear una clase Club y otra clase Socio.

La clase Socio debe tener los siguientes propiedades: nombre y la antigüedad en el club (en años).
Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
La clase Club debe tener como propiedades 3 objetos de la clase Socio.
Definir un método en la clase Club para imprimir el nombre del socio con mayor antigüedad en el club.
 */
fun main() {
    var socio1=Socio("Andres",12)
    var socio2=Socio("Ines",1)
    var socio3=Socio("Maria",2)

    var lista= mutableListOf<Socio>()
    lista.add(socio1)
    lista.add(socio2)
    lista.add(socio3)

    var club=Club(lista)
    println("El socio mas antiguo del club es:")
    println(club.Antiguedad())

}