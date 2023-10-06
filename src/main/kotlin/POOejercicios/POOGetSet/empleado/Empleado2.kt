package POOejercicios.POOGetSet.empleado

/*
Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo.

No permitir que se cargue un valor negativo en su sueldo.
Codificar el método imprimir en la clase.
 */
class Empleado2 (val nombre:String, sueldo:Double){



    var sueldo:Double=0.0
       set(valor) {
           if (valor < 0)
               field = 0.0
           else
               field = valor

//            while(valor<0){
//
//                println("El sueldo no puede ser negativo, vuelva a introducirlo")
//                valor= readln().toDouble()
//                field=valor
//            }


        }

    init {
        this.sueldo=sueldo
    }






    override fun toString(): String {
        return "Empleado2(nombre='$nombre', sueldo=$sueldo)"
    }


}