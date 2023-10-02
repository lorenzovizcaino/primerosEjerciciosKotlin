package ejemplosUsadosMaria.POO

// fuente - https://cursokotlin.com/capitulo-14-data-classes-en-kotlin/
data class Superhero(
    /*var superhero:String,
    var publisher:String,
    var realName:String,*/
    val superhero:String,
    val publisher:String,
    val realName:String,
    var photo:String
)
/*
* Objetos inmutables
Supongamos que no queremos que esos objetos puedan ser cambiados, es información verídica que no requiere de cambio alguno.
* Para ello debemos ir a la data class y cambiar var por val.
* */
/*
A simple vista podemos ver varias cosas, la primera que a diferencia de una clase normal
 esta no lleva llaves y la clase va precedida por «data».
 Esto le dice a Kotlin que esta clase va a tener por defecto una serie de funciones
 (aunque no vamos a tener que generarlas nosotros, lo hará el propio lenguaje por detrás)
 que podremos usar para rellenar dichos campos.
 La idea es tener un objeto Superhero por cada superhéroe que tengamos.
 Un objeto es simplemente la instancia de una clase.
 Aunque la clase parezca muy sencilla, por detrás nos ha generado funciones para poder
 recuperar el valor de cada uno de los atributos, sustituirlos, compararlos…
* */

fun main() {
    val batman:Superhero = Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg")
    val batmanRealName = batman.realName //Recuperamos "Bruce Wayne"
    //batman.realName = "Soy Batman" //Cambiamos "Bruce Wayne" por "Soy Batman"
    println(batman.toString()) //Devolverá todos los atributos con su valor

    //Ahora una vez creemos el objeto solo se podrá cambiar la foto.
    // Si pasáramos todos los campos a val tendríamos un objeto inmutable por lo que no podríamos usar por ejemplo el
    // batman.realName = «Nuevo nombre».

    //Si quisiéramos modificar a batman podríamos usar la función Copy() para crear un nuevo objeto
// con algún atributo distinto.

    val superBatman:Superhero = batman.copy(superhero = "SuperBatman")
    println(superBatman.toString())//Qué pasa?-veremos que todos los campos son iguales excepto el atributo superhero.

    //Por defecto, en cada data class, kotlin nos genera un componentN() para cada uno de los parámetros.
    println(batman.component1())//Batman
    println(batman.component2()) //DC
    println(batman.component3()) //Bruce Wayne
    println(batman.component4()) //https://cursokotlin.com/wp-content/uploads/2017/07/batman.jp

    //También podemos almacenar todos los parámetros de un objeto de golpe.

    val (superheroFav, publisherFav, realNameFav, photoFav) = batman
    superheroFav //Batman
    publisherFav //DC
    realNameFav //Bruce Wayne
    photoFav //https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg

   // Para acabar vamos a generar una lista de superheroes.

    var superheros:MutableList<Superhero> = mutableListOf()
    superheros.add(Superhero("Spiderman", "Marvel", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
    superheros.add(Superhero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
    superheros.add(Superhero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
    superheros.add(Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
    superheros.add(Superhero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
    superheros.add(Superhero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
    superheros.add(Superhero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
    superheros.add(Superhero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
}