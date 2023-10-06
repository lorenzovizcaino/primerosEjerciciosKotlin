package POOejercicios.POOGetSet.empleado


/*
Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo.

No permitir que se cargue un valor negativo en su sueldo.
Codificar el método imprimir en la clase.
 */
class Empleado (val nombre:String, var sueldo:Double){

    init {
        while(sueldo<0){

            println("El sueldo no puede ser negativo, vuelva a introducirlo")
            sueldo= readln().toDouble()
        }
        println("Empleado creado correctamente")
    }

    override fun toString(): String {
        return "Empleado(nombre='$nombre', sueldo=$sueldo)"
    }


}