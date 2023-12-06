class Persona(val nombre: String, val edad: Int, val ocupacion: String) {
    fun mostrarDescripcion() {
        println("$nombre, $edad años, $ocupacion")
    }
}
