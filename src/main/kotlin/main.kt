/** CONSTRUCTORES */

fun main() {
    val alumno = Usuario("Emanuel", "Munoz") // Instanciar (Sirve para solicitar algo)
    alumno.nombre = "Daniel"
    //alumno.apellido = "Munoz"
    alumno.mostrarNombreCompleto()

    println("---------------")

    val profesor = Usuario("Alexander", "Ramirez")
    //profesor.nombre = "Alexander"
    profesor.apellido = "Rodríguez"
    profesor.mostrarNombreCompleto()

    println("---------------")

    val alumno2 = Usuario2("JLex")
    alumno2.mostrarNombreCompleto()

    val alumno3 = Usuario2("Joe", "RR")
    alumno3.mostrarNombreCompleto()
}

/**
 * Constructor:
 * En POO, un constructor es una función especial
 * que sirve para inicializar un objeto de una clase.
 * En él se asignan los valores iniciales del nuevo objeto.
 *
 * Para constructores primarios (simples) se puede obviar
 * la palabra "constructor"
 */