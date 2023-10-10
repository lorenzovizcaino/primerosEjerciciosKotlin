package POOejercicios.POODataClass
/*
Plantear un data class llamado Dado con una única propiedad llamada valor.
Sobreescribir el método toString para que muestre tantos asteriscos como indica la propiedad valor.
 */
data class Dado (var valor:Int){
    override fun toString(): String {
        var cadena:String=""
        for(i in 1..valor){
           cadena+="*"
        }
        return cadena
    }
}