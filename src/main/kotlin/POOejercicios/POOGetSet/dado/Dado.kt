package POOejercicios.POOGetSet.dado


/*
Plantear una clase llamada Dado.
Definir una propiedad llamada valor que permita cargar un valor comprendido entre 1 y 6
si llega un valor que no está comprendido en este rango se debe cargar un 1.

Definir dos métodos, uno que genere un número aleatorio entre 1 y 6 y otro que lo imprima.
Al constructor llega el valor inicial que debe tener el dado (tratar de enviarle el número 7)
 */
class Dado {

    var valor:Int=1
        set(value) {
            if(value<1 || value>6){
                field=1
            }else field = value
        }
}