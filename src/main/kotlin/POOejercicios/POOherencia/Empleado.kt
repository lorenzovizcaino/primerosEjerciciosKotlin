package POOejercicios.POOherencia

/*
Plantear una clase Persona que contenga dos propiedades: nombre y  edad.
Definir como responsabilidades el constructor que reciba el nombre y la edad.


En la función main del programa definir un objeto de la clase Persona y llamar a sus métodos.

Declarar una segunda clase llamada Empleado que herede de la clase  Persona y agregue una propiedad sueldo
y muestre si debe pagar impuestos (sueldo superior a 3000)


También en la función main del programa crear un objeto de la clase Empleado.
 */

class Empleado (nombre:String, edad:Int,var sueldo:Double):Persona(nombre,edad) {

    fun impuestos(): Boolean {
        return sueldo > 3000

    }

}



