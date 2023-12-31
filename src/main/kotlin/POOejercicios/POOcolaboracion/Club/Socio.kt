package POOejercicios.POOcolaboracion.Club
/*
Plantear una clase Club y otra clase Socio.

La clase Socio debe tener los siguientes propiedades: nombre y la antigüedad en el club (en años).
Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
La clase Club debe tener como propiedades 3 objetos de la clase Socio.
Definir un método en la clase Club para imprimir el nombre del socio con mayor antigüedad en el club.
 */
class Socio (var nombre:String, var antiguedad:Int){


    init {
        if(!nombre.equals("")) println("Se ha creado un socio con nombre: $nombre")
    }


    constructor() : this("",0)

    override fun toString(): String {
        return "Socio(nombre='$nombre', antiguedad=$antiguedad)"
    }


}