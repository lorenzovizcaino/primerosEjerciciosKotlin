package POOejercicios.POOcolaboracion.Club
/*
Plantear una clase Club y otra clase Socio.

La clase Socio debe tener los siguientes propiedades: nombre y la antigüedad en el club (en años).
Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
La clase Club debe tener como propiedades 3 objetos de la clase Socio.
Definir un método en la clase Club para imprimir el nombre del socio con mayor antigüedad en el club.
 */
class Club (var socios:MutableList<Socio>){



    fun Antiguedad():Socio{
        var mayor:Int=0
        var socio:Socio=Socio()
//        for(i in 0..socios.size-1){
//            if (socios[i].antiguedad>mayor){
//                mayor=socios[i].antiguedad
//                socio=socios[i]
//            }
//        }

        //bucle forEach
        for(s in socios){
           if (s.antiguedad>mayor){
               mayor=s.antiguedad
               socio=s
           }
        }


        return socio
    }
}